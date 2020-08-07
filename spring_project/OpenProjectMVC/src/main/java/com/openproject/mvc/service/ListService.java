package com.openproject.mvc.service;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openproject.mvc.dao.MemberDaoInterface;
import com.openproject.mvc.model.Member;
import com.openproject.mvc.model.MemberListView;

@Service
public class ListService {

//	@Autowired
//	MemberDao dao;
	
//	@Autowired
//	JdbcTemplateMemberDao dao;
	
	private MemberDaoInterface dao;
	
	@Autowired
	SqlSessionTemplate sessionTemplate;

	public MemberListView memberList(HttpServletRequest request, HttpServletResponse response) {
		
		dao = sessionTemplate.getMapper(MemberDaoInterface.class);
		
		String searchType = request.getParameter("searchType");
		if(searchType==null || searchType.isEmpty()) {
			searchType = null;
		}
		String keyword = request.getParameter("keyword");
		if(keyword == null || keyword.isEmpty()) {
			keyword = null;
		}
		
		request.setAttribute("searchType", searchType);
		request.setAttribute("keyword", keyword);
		
		Map<String , Object> search = new HashMap<String, Object>();
		search.put("searchType",searchType);
		search.put("keyword",keyword);
		
		MemberListView listview = null;

		final int MESSAGE_COUNT_PER_PAGE = 3;
		try {

			List<Member> memberList = null;

			int memberTotalCount = dao.totalCount(search);
			
			int pageNumber = 1;
			String page = request.getParameter("page");
			if (page != null) {
				try {
					pageNumber = Integer.parseInt(page);
				} catch (NumberFormatException e) {
					
				}
			}

			int startRow = 0;

			if (memberTotalCount > 0) {
				

				startRow = (pageNumber - 1) * MESSAGE_COUNT_PER_PAGE ;
				search.put("startRow", startRow);
				search.put("endRow", MESSAGE_COUNT_PER_PAGE);
				memberList = dao.selectMemberList(search);
				System.out.println("memberList>>>>>>>>>"+memberList);

			} else {
				pageNumber = 0;
				memberList = Collections.emptyList();
			}

			listview = new MemberListView(memberTotalCount, pageNumber, memberList, memberTotalCount, MESSAGE_COUNT_PER_PAGE, startRow); 


		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 


		System.out.println(listview);
		return listview;
	}
}
