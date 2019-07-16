package com.uth.login.dao;

import java.util.List;
import java.util.Map;

import com.uth.login.model.MemberVO;

public interface MemberDao {
	
	public List<MemberVO> getList();
	public int join(MemberVO memberVO);
	public MemberVO login(Map<String, String> map);
	public MemberVO selectMember(String id);
	public int modify(MemberVO memberVO);

}

