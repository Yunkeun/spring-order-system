package com.yoonveloping.springordersystem.order;

import com.yoonveloping.springordersystem.discount.DiscountPolicy;
import com.yoonveloping.springordersystem.discount.FixDiscountPolicy;
import com.yoonveloping.springordersystem.discount.RateDiscountPolicy;
import com.yoonveloping.springordersystem.member.Member;
import com.yoonveloping.springordersystem.member.MemberRepository;
import com.yoonveloping.springordersystem.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

	private MemberRepository memberRepository = new MemoryMemberRepository();
//	private DiscountPolicy discountPolicy = new FixDiscountPolicy();
	private DiscountPolicy discountPolicy = new RateDiscountPolicy();

	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		Member member = memberRepository.findById(memberId);
		int discountPrice = discountPolicy.discount(member, itemPrice);

		return new Order(memberId, itemName, itemPrice, discountPrice);
	}
}
