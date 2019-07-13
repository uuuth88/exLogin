package com.uth.login.dao;

import java.util.ArrayList;
import java.util.List;

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

}