package com.apptad.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EmployeeDataController {
	
	@PostMapping("/demo")
	public String getdata(@RequestBody String empid) {
		return "Hello" +empid;
	}

}
