package com.uth.login.controller;

import java.util.*;

import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
	public String memberLogin(@RequestParam Map<String, String> map, HttpSession session) {
		
		MemberVO memberVO = service.memberlogin(map);
		
		if(memberVO != null) {
			session.setAttribute("loginMember", memberVO);
			return "redirect:/member/list";
		}else {
			return "redirect:/member/login";
		}
	}

/*
 * 로그인 후 드롭다운 메뉴에서 회원정보 수정 클릭 
 * 매핑된 주소로 수정 페이지로 이동하고 수정할 데이터를 입력받은 후
 * 리스트 페이지로 이동하기
 */
	@GetMapping("/modify")
	public ModelAndView memberModify(@RequestParam("member_id") String id) {
		MemberVO vo = service.selectMember(id);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/member/modify");
		mav.addObject("modifyMember", vo);
		
		return mav;
	}
	@PostMapping("/modify")
	public String memberModify(MemberVO memberVO) {
		
		return null;
	}
}
