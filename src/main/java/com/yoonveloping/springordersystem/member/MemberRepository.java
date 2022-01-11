package com.yoonveloping.springordersystem.member;

public interface MemberRepository {

	void save(Member member);

	Member findById(Long memberId);
}
