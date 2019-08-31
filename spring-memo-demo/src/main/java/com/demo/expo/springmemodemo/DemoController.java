package com.demo.expo.springmemodemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@RequestMapping("/haishiva")
	public String getMemo() {
		return "shiva is here";
	}

}
