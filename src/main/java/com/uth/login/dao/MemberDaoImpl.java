package com.uth.login.dao;

import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uth.login.model.MemberVO;
import com.uth.login.util.Criteria;
@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private SqlSession ss;

//	@Override
//	public List<MemberVO> getList() {
//		List<MemberVO> memberlist = new ArrayList<>();
//		
//		memberlist = ss.selectList("com.uth.mapper.memberMapper.memberlist");
//		
//		return memberlist;
//	}

	@Override
	public List<MemberVO> getList(Criteria cri) {
		List<MemberVO> memberlist = new ArrayList<>();
		memberlist = ss.selectList("com.uth.mapper.memberMapper.search", cri);
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

	@Override
	public MemberVO selectMember(String id) {
		MemberVO vo = new MemberVO();
		vo = ss.selectOne("com.uth.mapper.memberMapper.selectmember", id);
		return vo;
	}

	@Override
	public int modify(MemberVO memberVO) {
		int cnt = 0;
		cnt = ss.update("com.uth.mapper.memberMapper.membermodify", memberVO);
		return cnt;
	}

	@Override
	public int delete(String id) {
		int cnt = 0;
		cnt = ss.delete("com.uth.mapper.memberMapper.memberdelete", id);
		return cnt;
	}

}


