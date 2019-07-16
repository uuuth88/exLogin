package com.uth.login.controller;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.uth.login.dao.MemberDao;
import com.uth.login.model.MemberVO;
import com.uth.login.util.Criteria;

import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml", 
					   "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class MemberControllerTest {
	
	@Autowired
	private WebApplicationContext wac;
	
	@Autowired
	private Criteria cri;
	
	@Autowired
	private MemberDao dao;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void test() {
		try {
			cri = new Criteria();
			cri.setType("");
			cri.setKeyword("");
			
			List<MemberVO> list = dao.getList(cri);
			list.forEach(member -> log.info(member));
			
//			log.info(list);
			
//			System.out.println(mockMvc.perform(MockMvcRequestBuilders.get("/member/list"))
//				   .andReturn().getModelAndView());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
