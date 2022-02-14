package com.yoonveloping.springordersystem.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Member {

	private final Long id;
	private final String name;
	private final Grade grade;
}
