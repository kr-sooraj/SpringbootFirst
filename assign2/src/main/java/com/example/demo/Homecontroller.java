package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {

	@RequestMapping("home")
	public String homes() {
		System.out.println("Helloowowoow");
		return "home";
	}
}
