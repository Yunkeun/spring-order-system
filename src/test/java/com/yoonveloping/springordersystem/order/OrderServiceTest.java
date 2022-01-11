package com.yoonveloping.springordersystem.order;

import static org.junit.jupiter.api.Assertions.*;

import com.yoonveloping.springordersystem.member.Grade;
import com.yoonveloping.springordersystem.member.Member;
import com.yoonveloping.springordersystem.member.MemberService;
import com.yoonveloping.springordersystem.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

	MemberService memberService = new MemberServiceImpl();
	OrderService orderService = new OrderServiceImpl();

	@Test
	void createOrder() {
		// given
		Long memberId = 1L;
		Member member = new Member(1L, "memberA", Grade.VIP);
		memberService.join(member);

		String itemName = "itemA";
		int itemPrice = 10000;

		// when
		Order order = orderService.createOrder(memberId, itemName, itemPrice);

		// then
		Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
	}

}