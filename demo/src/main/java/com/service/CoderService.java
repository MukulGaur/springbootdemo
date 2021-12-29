package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.entity.Coder;
import com.repository.CoderRepository;

@Service
public class CoderService {
	
	@Autowired
	CoderRepository repo;
	
	public Coder addCoder(Coder c) {
		repo.save(c);
		return c;
	}
	
	public List<Coder> addCoders(List<Coder> ls){
		repo.saveAll(ls);
		return ls;
	}
	
	public List<Coder> getCoder(){
		List<Coder> ls = repo.findAll();
		return ls;
	}
	
	public Coder getCoderById(int cid) {
		Coder c = repo.findById(cid).orElseThrow();
		return c;
	}
	
	public Coder updateCoder(Coder c) {
		int id = c.getCid();
		Coder c1 = repo.findById(id).orElseThrow();
		
		c1.setCname(c.getCname());
		c1.setTech(c.getTech());
		repo.save(c1);
		return c1;
	}
	
	public String deleteCoderById(int cid) {
		repo.deleteById(cid);
		return "Deleted";
	}
	
	public String deleteCoders(Coder c) {
		repo.delete(c);
		return "Deleted";
	}
	
	public Coder getCoderByCname(String cname) {
		Coder c = repo.getCoderByCname(cname);
		return c;
	}
	
	
	public List<Coder> getCoderByTechSorted(@PathVariable String tech){
		List<Coder> ls = repo.getCoderByTechSorted(tech);
		return ls;
	}

}
