package com.yoonveloping.springordersystem.discount;

import com.yoonveloping.springordersystem.member.Grade;
import com.yoonveloping.springordersystem.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

	private final int discountFixAmount = 1000;

	@Override
	public int discount(Member member, int price) {
		if (member.getGrade() == Grade.VIP) {
			return discountFixAmount;
		}
		return 0;
	}
}
