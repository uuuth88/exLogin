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
	
	@GetMapping("/list")
	public void memberList(Model model){
		
		List<MemberVO> memberlist = new ArrayList<>();
		
		memberlist = service.memberlist();
		
		model.addAttribute("memberlist", memberlist);
		
	}
	
}
