package com.yoonveloping.springordersystem.discount;

import com.yoonveloping.springordersystem.member.Grade;
import com.yoonveloping.springordersystem.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

	private int discountPercent = 10;

	@Override
	public int discount(Member member, int price) {
		if (member.getGrade() == Grade.VIP) {
			return price * discountPercent / 100;
		}
		return 0;
	}
}
