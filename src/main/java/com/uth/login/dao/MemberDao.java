package com.uth.login.dao;

import java.util.List;
import java.util.Map;

import com.uth.login.model.MemberVO;

public interface MemberDao {
	
	public List<MemberVO> getList();
	public int join(MemberVO memberVO);
	public MemberVO login(Map<String, String> map);
	
	//업데이트 멤버
	//업데이트 할 멤버 객체 찾고
	public MemberVO selectMember(String id);
	//업데이트 내용 반영
	public int modify(MemberVO memberVO);
}

