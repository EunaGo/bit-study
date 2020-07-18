package member.service;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import member.model.Member;
import service.Service;

public class MemberEditServiceImpl implements Service {

	MemberDao dao;

	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {

		Connection conn = null;

		int idx = 0;
		String upw = null;
		String uname = null;
		String uphoto = null;

		try {
			conn = ConnectionProvider.getConnection();
			dao = MemberDao.getInstance();

			boolean isMultipart = ServletFileUpload.isMultipartContent(request);

			if (isMultipart) {

				DiskFileItemFactory factory = new DiskFileItemFactory();
				ServletFileUpload upload = new ServletFileUpload(factory);

				List<FileItem> items = upload.parseRequest(request);

				Iterator<FileItem> ite = items.iterator();

				while (ite.hasNext()) {

					FileItem item = ite.next();

					// isFormField() : text value�� ������ input Ȯ��
					if (item.isFormField()) { // type=file �̿��� input
						// �Ķ���� �̸�
						String paramName = item.getFieldName();
						// �Ķ������ ��
						String paramValue = item.getString("utf-8");
						// System.out.println(paramName + " = " + paramValue);

						if(paramName.equals("idx")) {
							
							idx = Integer.parseInt(paramValue);
						}
						else if (paramName.equals("upw")) {
							upw = paramValue;
						} else if (paramName.equals("uname")) {
							uname = paramValue;
						}

					} else { // type=file

						// ���� ������ ���
						String uri = "/upload/users";

						// String uri =
						// request.getSession().getServletContext().getInitParameter("uploadPath");

						// �ý����� ����(����) ���
						String realPath = request.getSession().getServletContext().getRealPath(uri);
						// System.out.println(realPath);

						String newFileName = System.nanoTime() + "_" + item.getName();

						// ������ ����ҿ� ���� ����
						File saveFile = new File(realPath, newFileName);
						item.write(saveFile);
						System.out.println("���� �Ϸ�");

						uphoto = uri + "/" + newFileName;

					}
				}



				Member member = new Member();
				member.setIdx(idx);
				member.setUpw(upw);
				member.setUname(uname);
				member.setUphoto(uphoto);
				dao.editMember(conn, member);
				System.out.println("uphoto : "+uphoto);
				System.out.println(member);

			}
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		return "/WEB-INF/views/member/memberEditConfirm.jsp";
	}

}
