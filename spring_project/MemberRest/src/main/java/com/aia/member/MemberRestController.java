package com.aia.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aia.member.model.EditRequest;
import com.aia.member.model.Member;
import com.aia.member.model.RegRequest;
import com.aia.member.service.MemberDeleteService;
import com.aia.member.service.MemberEditService;
import com.aia.member.service.MemberListService;
import com.aia.member.service.MemberRegService;
import com.aia.member.service.MemberViewService;



@RestController

@RequestMapping("/members")
public class MemberRestController {
	
	@Autowired
	private MemberListService listService;
	
	@Autowired
	private MemberRegService regService;

	@Autowired
	private MemberViewService viewService;
	
	@Autowired
	private MemberEditService editService;
	
	@Autowired
	private MemberDeleteService deleteService;
	
	//@Autowired
	//private MemberDeleteService deleteService;
	
	// 회원 리스트 : Json으로 응답
	@GetMapping					// GET | /members
	public List<Member> getMemberList(){
		return listService.getMemberList();
	}
	
	// 회원가입
	@PostMapping				// POST | /members
	public int reg(RegRequest regRequest, HttpServletRequest request) {
		return regService.regMember(regRequest, request);
	}
	
	// 한명의 회원 정보보기
	@GetMapping("/{idx}")
	public Member getMember(@PathVariable("idx") int idx) {
		
		return viewService.getMember(idx);
	}
	
	// 한명의 회원 정보 수정
	//@PutMapping("/{idx}")		// PUT | /members/{idx}
	@PostMapping("/{idx}")
	public int edit(@PathVariable("idx") int idx, EditRequest editRequest, HttpServletRequest request) {
		
		editRequest.setIdx(idx);
		
		System.out.println("edit 멤버>>>>"+editRequest);
		
		return editService.editMember(editRequest,  request);
	}
	
	// 회원 삭제
	@DeleteMapping("/{idx}")	//  
	public int delete(@PathVariable("idx") int idx) {
		return deleteService.deleteMember(idx);
	}
}
