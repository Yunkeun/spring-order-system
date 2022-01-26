package com.yoonveloping.springordersystem;

import com.yoonveloping.springordersystem.discount.DiscountPolicy;
import com.yoonveloping.springordersystem.discount.RateDiscountPolicy;
import com.yoonveloping.springordersystem.member.MemberRepository;
import com.yoonveloping.springordersystem.member.MemberService;
import com.yoonveloping.springordersystem.member.MemberServiceImpl;
import com.yoonveloping.springordersystem.member.MemoryMemberRepository;
import com.yoonveloping.springordersystem.order.OrderService;
import com.yoonveloping.springordersystem.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public MemberService memberService() {
		return new MemberServiceImpl(memberRepository());
	}

	@Bean
	public OrderService orderService() {
		return new OrderServiceImpl(memberRepository(), discountPolicy());
	}

	@Bean
	public MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}

	@Bean
	public DiscountPolicy discountPolicy() {
		return new RateDiscountPolicy();
	}
}
