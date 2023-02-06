package com.mysite.sbb;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class HelloLombok2 {

	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regdate;
	private int cnt;
	
	
	public static void main(String[] args) {
		// 객체 생성후 테스트

		HelloLombok2 lombok2 = new HelloLombok2();
		
		//setter이용해서 값을 입력
		lombok2.setSeq(20);
		lombok2.setTitle("안녕하세요");
		lombok2.setWriter("박주성");
		lombok2.setContent("롬북2");
		lombok2.setCnt(0);
		
		//getter을 이욯해서 값을 출력
		
		System.out.println(lombok2.getSeq());
		System.out.println(lombok2.getTitle());
		System.out.println(lombok2.getWriter());
		System.out.println(lombok2.getContent());
		System.out.println(lombok2.getRegdate());
		System.out.println(lombok2.getCnt());
		
		//toString() 메소드 호출 : 객체 자체를 print
		System.out.println(lombok2);
	}

}
