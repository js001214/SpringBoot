package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@GetMapping("/testweb")
	@ResponseBody
	public String test() { //String으로 리턴
		
		return "Test 블락 입니다. - MyWebsite";
	}
}
