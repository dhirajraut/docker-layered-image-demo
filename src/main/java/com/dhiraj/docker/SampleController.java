package com.dhiraj.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping("/check")
	public String getTitle() {
		return "You have successfully called the SampleController. Congratulations"; 
	}
}
