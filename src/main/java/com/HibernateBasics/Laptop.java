package com.HibernateBasics;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity(name = "alien_laps")
public class Laptop {
	@Id
	private int lid;
	private String lname;
	@ManyToOne
	private Alien al;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	public Alien getAl() {
		return al;
	}
	public void setAl(Alien al) {
		this.al = al;
	}
	
}
