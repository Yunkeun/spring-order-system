package com.yoonveloping.springordersystem;

import com.yoonveloping.springordersystem.member.Grade;
import com.yoonveloping.springordersystem.member.Member;
import com.yoonveloping.springordersystem.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

	public static void main(String[] args) {

		// 순수 자바에서는 직접 객체드를 생성하고 DI를 했다.
//		AppConfig appConfig = new AppConfig();
//		MemberService memberService = appConfig.memberService();

		// AppConfig 클래스에 있는 메소드들을(객체 생성한 것들을) 스프링 컨테이너에 넣어 관리해준다.
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
			AppConfig.class);
		MemberService memberService = applicationContext.getBean("memberService",
			MemberService.class);
		Member member = new Member(1L, "memberA", Grade.VIP);
		memberService.join(member);

		Member findMember = memberService.findMember(1L);
		System.out.println("new member : " + member.getName());
		System.out.println("find member : " + findMember.getName());
	}

}
