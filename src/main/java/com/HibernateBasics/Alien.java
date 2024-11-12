package com.HibernateBasics;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Alien {
	@Id//for primary key
	int aid;
	String aname;
	String color;
	
	@OneToMany(mappedBy = "al")
	List<Laptop> laps=new ArrayList<>();
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public List<Laptop> getLaps() {
		return laps;
	}
	public void setLaps(List<Laptop> laps) {
		this.laps = laps;
	}
	@Override
	public String toString() {
		return "Alien [aid="+aid+", name="+aname+", color="+color+"]";
	}
	
}
