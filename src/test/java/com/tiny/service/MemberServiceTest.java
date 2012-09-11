package com.tiny.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.facebook.api.impl.FacebookTemplate;

import com.tiny.common.CommonTest;
import com.tiny.member.Member;

public class MemberServiceTest extends CommonTest {
	private FacebookTemplate facebook;

	@Autowired
	private MemberService memberService;

	@Before
	public void before() {
		facebook = new FacebookTemplate(
				"AAAC1oNlnFTcBAHgMtDUZCe8XZAbS3Lnl8pbZAsi9gUZCZC8iiN70eGW1ZAcZCsaki9sJJq2ODkazf9I3ZB3Vvvqz8ZCTjwxr4XnqPCePjct6FtQZDZD");
	}

	@Test
	public void testGetMemger() {
		Member member = memberService.getMember(facebook.userOperations().getUserProfile());
		assertThat(member.getName(), is("Gildong Hong"));
		assertThat(member.getEmail(), is("tiny657@naver.com"));
		assertThat(member.getUserId(), is("100004435682348"));
	}
}