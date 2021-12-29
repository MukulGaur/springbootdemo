package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Laptop;
import com.repository.LaptopRepository;

@Service
public class LaptopService {
	
	@Autowired
	LaptopRepository lprepo;
	
	public Laptop addLaptop(Laptop lp) {
		lprepo.save(lp);
		return lp;
	}

}
