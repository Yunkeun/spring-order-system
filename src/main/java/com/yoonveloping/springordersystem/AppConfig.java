package com.yoonveloping.springordersystem;

import com.yoonveloping.springordersystem.discount.DiscountPolicy;
import com.yoonveloping.springordersystem.discount.RateDiscountPolicy;
import com.yoonveloping.springordersystem.member.MemberRepository;
import com.yoonveloping.springordersystem.member.MemberService;
import com.yoonveloping.springordersystem.member.MemberServiceImpl;
import com.yoonveloping.springordersystem.member.MemoryMemberRepository;
import com.yoonveloping.springordersystem.order.OrderService;
import com.yoonveloping.springordersystem.order.OrderServiceImpl;

public class AppConfig {

	public MemberService memberService() {
		return new MemberServiceImpl(memberRepository());
	}

	public OrderService orderService() {
		return new OrderServiceImpl(memberRepository(), discountPolicy());
	}

	public MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}

	public DiscountPolicy discountPolicy() {
		return new RateDiscountPolicy();
	}
}
