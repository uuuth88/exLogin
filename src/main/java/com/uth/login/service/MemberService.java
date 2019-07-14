package com.uth.login.service;

import java.util.List;

import com.uth.login.model.MemberVO;

public interface MemberService {
	
	public List<MemberVO> memberlist();
	public int memberjoin(MemberVO memberVO);
}
