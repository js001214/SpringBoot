package com.mysite.sbb2;

import org.springframework.web.service.annotation.GetExchange;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor	//기본생성자 자동 출력
public class HelloLombok {
	
	private String name;
	private int age;
	

	
	public static void main(String[] args) {
		
		HelloLombok lombok = new HelloLombok();
	//setter로 입력
	lombok.setName("주성");
	lombok.setAge(24);
	
	//getter로 출력
	System.out.println(lombok.getName());
	System.out.println(lombok.getAge());
	
	//toString
	
	System.out.println(lombok);
	
	
	}
}
