package com.uth.login.model;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class MemberVO {
	private String member_id;
	private String member_pw;
	private String member_name;
	private String member_email;
	private Date regdate;
	
//	setter/getter	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
//	toString()	
	@Override
	public String toString() {
		return "\n====================\n"
				+ "MemberVO [member_id=" + member_id + ", member_pw="+ member_pw+"\n" 
				+ ", member_name=" + member_name + "member_email=" + member_email+"\n" 
				+ ", regdate=" + regdate + "]"+"\n"
				+"\n====================\n";
	}

}
