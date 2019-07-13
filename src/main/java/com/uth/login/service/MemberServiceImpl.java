package com.uth.login.service;

import java.util.List;

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

}

