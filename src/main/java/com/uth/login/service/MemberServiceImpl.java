package com.uth.login.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uth.login.dao.MemberDao;
import com.uth.login.model.MemberVO;
@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao dao;
	
	@Override
	public List<MemberVO> memberlist() {
		return dao.getList();
	}

	@Override
	public int memberjoin(MemberVO memberVO) {
		return dao.join(memberVO);
	}

	@Override
	public MemberVO memberlogin(Map<String, String> map) {
		return dao.login(map);
	}

	@Override
	public MemberVO selectMember(String id) {
		return dao.selectMember(id);
	}

	@Override
	public int membermodify(MemberVO memberVO) {
		return dao.modify(memberVO);
	}

}

