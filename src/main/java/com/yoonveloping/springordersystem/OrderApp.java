package com.yoonveloping.springordersystem;

import com.yoonveloping.springordersystem.member.Grade;
import com.yoonveloping.springordersystem.member.Member;
import com.yoonveloping.springordersystem.member.MemberService;
import com.yoonveloping.springordersystem.order.Order;
import com.yoonveloping.springordersystem.order.OrderService;

public class OrderApp {

	public static void main(String[] args) {

		AppConfig appConfig = new AppConfig();
		MemberService memberService = appConfig.memberService();
		OrderService orderService = appConfig.orderService();

		Long memberId = 1L;
		Member member = new Member(memberId, "memberA", Grade.VIP);
		memberService.join(member);

		Order order = orderService.createOrder(memberId, "itemA", 20000);
		System.out.println("order : " + order);
	}

}
