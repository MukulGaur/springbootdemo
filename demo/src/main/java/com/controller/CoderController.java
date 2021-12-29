package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Coder;
import com.service.CoderService;

//@Controller
@RestController
@RequestMapping(path="/api")
public class CoderController {
	
	@Autowired
	CoderService coderService;
	
//	public CoderController(CoderService coderService) {
//		super();
//		this.coderService = coderService;
//	}
	
	@RequestMapping("/hello")
	//@ResponseBody
	public String hello()
	{
		return "Welcome to Spring MVC";
	}
	
	@PostMapping("/addCoder")
	public Coder addCoder(@RequestBody Coder c) {
		coderService.addCoder(c);
		return c;
	}
	
	@PostMapping("/addCoders")
	public List<Coder> addCoders(@RequestBody List<Coder> ls) {
		List<Coder> le = coderService.addCoders(ls);
		return le;
	}
	
	@GetMapping("/getCoders")
	public List<Coder> getCoder(){
		return coderService.getCoder();
	}
	
	@GetMapping("/getCoder/{cid}")
	public Coder getCoderById(@PathVariable int cid) {
		Coder c1 = coderService.getCoderById(cid);
		return c1;
	}
	
	@GetMapping("/getCoderByCname/{cname}")
	public Coder getCoderByCname(@PathVariable String cname) {
		Coder c1 = coderService.getCoderByCname(cname);
		return c1;
	}
	
	@GetMapping("/getCoderByTech/{tech}")
	public List<Coder> getCoderByTechSorted(@PathVariable String tech) {
		List<Coder> c1 = coderService.getCoderByTechSorted(tech);
		return c1;
	}
	
	@PutMapping("/updateCoder")
	public Coder updateCoder(@RequestBody Coder c) {
		Coder c1 = coderService.updateCoder(c);
		return c1;
	}
	
	@DeleteMapping("/deleteCoder/{cid}")
	public String deleteCoderById(@PathVariable int cid) {
		coderService.deleteCoderById(cid);
		return "Deleted";
	}
	
	@DeleteMapping("/deleteCoders")
	public String deleteCoders(@RequestBody Coder c) {
		coderService.deleteCoders(c);
		return "Deleted";
	}
}