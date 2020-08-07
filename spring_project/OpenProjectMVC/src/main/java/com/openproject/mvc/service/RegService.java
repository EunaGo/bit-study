package com.openproject.mvc.service;

import java.io.File;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.openproject.mvc.dao.MemberDaoInterface;
import com.openproject.mvc.model.Member;
import com.openproject.mvc.model.RegRequest;

@Service
public class RegService {

//	@Autowired
//	JdbcTemplateMemberDao dao;
	
//	@Autowired
//	MybatisMemberDao dao;
	
	private MemberDaoInterface dao;
	
	@Autowired
	SqlSessionTemplate sessionTemplate;

	public int memberReg(RegRequest regRequest, HttpServletRequest request) {
		
		dao = sessionTemplate.getMapper(MemberDaoInterface.class);

		int resultCnt = 0;
		Member member = regRequest.toMember();
		
		try {
			System.out.println("입력 전 : "+member.getIdx());
			
			MultipartFile file = regRequest.getUphoto();
			
			String fileName = file.getOriginalFilename();
			
			System.out.println("reg: "+regRequest);
			
			String uri = "/resources/upload/users";
			String realPath = request.getSession().getServletContext().getRealPath(uri);
			
			String newFileName = System.nanoTime() + "_" + fileName;
			
			File saveFile = new File(realPath, newFileName);
			
			file.transferTo(saveFile);
			
			String uphoto = uri + "/"+ newFileName;
			
			member.setUphoto((uphoto));
			
			resultCnt = dao.insertMember(member);
			
			System.out.println("입력 후 : "+member.getIdx());
			
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return resultCnt;
	}
}