package com.yoonveloping.springordersystem;

import com.yoonveloping.springordersystem.discount.RateDiscountPolicy;
import com.yoonveloping.springordersystem.member.MemberService;
import com.yoonveloping.springordersystem.member.MemberServiceImpl;
import com.yoonveloping.springordersystem.member.MemoryMemberRepository;
import com.yoonveloping.springordersystem.order.OrderService;
import com.yoonveloping.springordersystem.order.OrderServiceImpl;

public class AppConfig {

	public MemberService memberService() {
		return new MemberServiceImpl(new MemoryMemberRepository());
	}

	public OrderService orderService() {
		return new OrderServiceImpl(new MemoryMemberRepository(), new RateDiscountPolicy());
	}
}
