package rk.demo.openshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenShiftDemo {
	
	@GetMapping(value = "/display")
	public String display() {
		return "welcome to openshift with spring boot";
	}

	@GetMapping(value = "/user/{name}")
	public String userDetails(@PathVariable("name") String userName) {
		return "welcome " + userName;
	}
}
