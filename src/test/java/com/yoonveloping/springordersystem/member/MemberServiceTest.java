package com.yoonveloping.springordersystem.member;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MemberServiceTest {

	MemberService memberService = new MemberServiceImpl();

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