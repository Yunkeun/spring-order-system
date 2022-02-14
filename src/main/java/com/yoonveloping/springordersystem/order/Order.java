package com.yoonveloping.springordersystem.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class Order {

	private final Long memberId;
	private final String itemName;
	private final int itemPrice;
	private final int discountPrice;
}
