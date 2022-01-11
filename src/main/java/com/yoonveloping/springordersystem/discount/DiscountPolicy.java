package com.yoonveloping.springordersystem.discount;

import com.yoonveloping.springordersystem.member.Member;

public interface DiscountPolicy {

	int discount(Member member, int price);
}
