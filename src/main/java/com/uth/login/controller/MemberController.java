package com.uth.login.controller;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.uth.login.model.MemberVO;
import com.uth.login.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	@Autowired
	private MemberService service;
	
	@Autowired
	private MemberVO memberVO;
/*
 * 로그인 하지 않으면 접근하지 못하게 만들기	
 */
	@GetMapping("/list")
	public void memberList(Model model){
		
		List<MemberVO> memberlist = new ArrayList<>();
		
		memberlist = service.memberlist();
		
		model.addAttribute("memberlist", memberlist);
		
	}
	
/*
 * 회원가입 메소드 구현 후 로그인 페이지(/member/login)로 보내기	
 */
	@GetMapping("/join")
	public String memberJoin() {
		return "member/join";
	}
	@PostMapping("/join")
	public String memberJoin(MemberVO memberVO) {
		int cnt = 0;
		cnt = service.memberjoin(memberVO);
		return cnt==1 ? "member/login" : "member/join";
	}
	
/*
 * 로그인 후 리스트 페이지(/member/list)로 보내기
 */
	@GetMapping("/login")
	public String memberLogin() {
		return "member/login";
	}
	@PostMapping("/login")
	public void memberLogin(String id, String pw) {
		
	}
	
	
}
