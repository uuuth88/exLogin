package com.uth.login.service;

import java.util.List;
import java.util.Map;

import com.uth.login.model.MemberVO;

public interface MemberService {
	
	public List<MemberVO> memberlist();
	public int memberjoin(MemberVO memberVO);
	public MemberVO memberlogin(Map<String, String> map);
	public MemberVO selectMember(String id);
	public int membermodify(MemberVO memberVO);
}
