package com.grouptest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test_controller {

	@RequestMapping("/")
	public String firstPage() {
		return "testing";
	}
}
