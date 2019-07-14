package com.uth.login.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.uth.login.model.MemberVO;
import com.uth.login.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	@Autowired
	private MemberService service;
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
		
		
		return "redirect:member/login";
	}
/*
 * 로그인 후 리스트 페이지(/member/list)로 보내기
 */
	@GetMapping("/login")
	public void memberLogin() {
		
	}
	
	
}
