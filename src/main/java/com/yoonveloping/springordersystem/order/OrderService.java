package com.yoonveloping.springordersystem.order;

public interface OrderService {

	Order createOrder(Long memberId, String itemName, int itemPrice);
}
