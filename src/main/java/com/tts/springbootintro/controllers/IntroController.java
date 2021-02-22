package com.tts.springbootintro.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntroController {
	@RequestMapping("/")
	public String home() {
		return "My very own project";
	}
}
