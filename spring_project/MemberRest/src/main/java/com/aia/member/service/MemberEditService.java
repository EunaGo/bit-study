package com.aia.member.service;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.aia.member.dao.MemberDao;
import com.aia.member.model.EditRequest;
import com.aia.member.model.Member;


@Service
public class MemberEditService {

	private MemberDao dao;

	@Autowired
	SqlSessionTemplate template;

	public int editMember(EditRequest editRequest, HttpServletRequest request) {

		System.out.println("euna: " + editRequest);

		dao = template.getMapper(MemberDao.class);

		int result = 0;

		Member member = editRequest.toMember();

		try {

			MultipartFile file = editRequest.getUphoto();

			if (file != null && !file.isEmpty() && file.getSize() > 0) {

				// 서버 내부의 경로
				// String uri =
				// request.getSession().getServletContext().getInitParameter("memberUploadPath");
				String uri = "/upload";

				// 시스템의 실제(절대) 경로
				String realPath = request.getSession().getServletContext().getRealPath(uri);

				// 저장할 이미지 파일의 새로운 이름 생성
				String newFileName = System.nanoTime() + "_" + file.getOriginalFilename();

				// 서버의 저장소에 실제 저장
				File saveFile = new File(realPath, newFileName);
				file.transferTo(saveFile);
				System.out.println("저장 완료 : " + newFileName);

				// 데이터베이스에 저장할 Member 객체의 데이터를 완성한다. : 사진 경로
				member.setUphoto(newFileName);

				File oldFile = new File(realPath, editRequest.getOldFile());

				// 파일이 존재하면
				if (oldFile.exists()) {
					// 파일을 삭제
					oldFile.delete();
				}

			}
			System.out.println("edit emmmm: " + editRequest);

			// 데이터베이스 : update
			result = dao.editMember(member);

		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
}
