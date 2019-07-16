package com.uth.login.dao;

import java.util.List;
import java.util.Map;

import com.uth.login.model.MemberVO;
import com.uth.login.util.Criteria;

public interface MemberDao {
	
//	public List<MemberVO> getList();
	public List<MemberVO> getList(Criteria cri);
	public int join(MemberVO memberVO);
	public MemberVO login(Map<String, String> map);
	public MemberVO selectMember(String id);
	public int modify(MemberVO memberVO);
}

