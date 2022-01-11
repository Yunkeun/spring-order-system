package com.yoonveloping.springordersystem.member;

public interface MemoryService {

	void join(Member member);

	Member findMember(Long memberId);
}
