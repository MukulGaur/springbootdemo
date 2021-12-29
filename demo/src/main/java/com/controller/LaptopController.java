package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Laptop;
import com.service.LaptopService;

@RestController
@RequestMapping(path="/api")
public class LaptopController {
	
	@Autowired
	LaptopService lpService;
	
	@PostMapping("/addLaptop")
	public Laptop addLaptop(@RequestBody Laptop lp) {
		Laptop l1 = lpService.addLaptop(lp);
		return l1;
	}

}
