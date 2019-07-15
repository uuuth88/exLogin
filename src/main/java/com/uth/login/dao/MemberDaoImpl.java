package com.uth.login.dao;

import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uth.login.model.MemberVO;
@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private SqlSession ss;

	@Override
	public List<MemberVO> getList() {
		List<MemberVO> memberlist = new ArrayList<>();
		
		memberlist = ss.selectList("com.uth.mapper.memberMapper.memberlist");
		
		return memberlist;
	}

	@Override
	public int join(MemberVO memberVO) {
		int cnt = 0;
		cnt = ss.insert("com.uth.mapper.memberMapper.memberjoin", memberVO);
		return cnt;
	}

	@Override
	public MemberVO login(Map<String, String> map) {
		MemberVO vo = new MemberVO();
		vo = ss.selectOne("com.uth.mapper.memberMapper.memberlogin", map);
		return vo;
	}

}

