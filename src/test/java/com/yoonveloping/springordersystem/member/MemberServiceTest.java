package com.yoonveloping.springordersystem.member;

import static org.assertj.core.api.Assertions.*;

import com.yoonveloping.springordersystem.AppConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberServiceTest {

	MemberService memberService;

	@BeforeEach
	public void beforeEach() {
		AppConfig appConfig = new AppConfig();
		memberService = appConfig.memberService();
	}

	@Test
	void join() {
		// given
		Member member = new Member(1L, "memberA", Grade.VIP);

		// when
		memberService.join(member);
		Member findMember = memberService.findMember(member.getId());

		// then
		assertThat(member).isEqualTo(findMember);
	}

}