package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Coder {
	
	@Id
	@GeneratedValue
	private int cid;
	private String cname;
	private String tech;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "coder")
	List<Laptop> ls;
	
	public List<Laptop> getLs() {
		return ls;
	}
	public void setLs(List<Laptop> ls) {
		this.ls = ls;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Coder [cid=" + cid + ", cname=" + cname + ", tech=" + tech + "]";
	}
}