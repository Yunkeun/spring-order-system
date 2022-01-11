package com.yoonveloping.springordersystem.order;

import com.yoonveloping.springordersystem.discount.DiscountPolicy;
import com.yoonveloping.springordersystem.member.Member;
import com.yoonveloping.springordersystem.member.MemberRepository;

public class OrderServiceImpl implements OrderService {

	private MemberRepository memberRepository;
	private DiscountPolicy discountPolicy;

	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		Member member = memberRepository.findById(memberId);
		int discountPrice = discountPolicy.discount(member, itemPrice);

		return new Order(memberId, itemName, itemPrice, discountPrice);
	}
}
