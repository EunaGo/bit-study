package com.aia.mm.dao;

import java.util.List;

import com.aia.mm.model.Member;

public interface MemberDao {

	// 회원 가입
	public int insertMember(Member member);

	// 회원수정
	public int editMember(Member member);

	// 회원 삭제
	public int deleteMember(int idx);
	
	// 한명의 회원 선택
	public Member selectByIdx(int idx);

	// 회원 전체 리스트
	public List<Member> selectList();
	
	

	
}
