package com.kiran.background;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hi")
	public String myMethod() {
		return "hi";
	}
}
