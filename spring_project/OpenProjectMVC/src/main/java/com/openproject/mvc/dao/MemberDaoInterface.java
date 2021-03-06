package com.openproject.mvc.dao;

import java.util.List;
import java.util.Map;

import com.openproject.mvc.model.Member;
import com.openproject.mvc.model.MemberXML;


public interface MemberDaoInterface {
	
	public Member selectById(String uid, String upw);
	

	// 회원가입
	public int insertMember(Member member);
	
	// 회원수정
	public int editMember(Member member);
	
	// 회원 삭제
	public int deleteMember(Member member);
	
	// 한명의 회원 선택
	public Member selectByIdx(int idx);
	
	// 회원 전체 리스트 
	public List<Member> selectTotalList();
	
	// 전체 게시물의 개수 : 검색 포함
	public int totalCount(Map search);
	
	// 전체 게시물의 리스트 List<Member>
	public List<Member> selectMemberList(Map search);
	
	// 전체 XML 회원 리스트
	public List<MemberXML> selectTotalListXml();
	
	
}
