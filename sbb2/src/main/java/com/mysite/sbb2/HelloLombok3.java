package com.mysite.sbb2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor	//필드의 값을 직접 할당
public class HelloLombok3 {
	
	private String name;
	private int age;
	
	public static void main(String[] args) {
	
		//AllArgsConstructor 
		HelloLombok3 lombok = new HelloLombok3("주성", 24);
		
		//출력
		
		System.out.println(lombok.name);
		System.out.println(lombok.age);
		
		//tostring
		
		System.out.println(lombok);
		
		
		
		
	}

}
