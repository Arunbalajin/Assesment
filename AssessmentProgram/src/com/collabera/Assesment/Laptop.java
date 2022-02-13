package com.collabera.Assesment;

import java.util.Objects;

public class Laptop {

	private int Lid;
	private String Lname;
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public Laptop(int lid, String lname) {
		super();
		Lid = lid;
		Lname = lname;
	}
	public Laptop() {
		super();
	}
	@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", Lname=" + Lname + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Lid, Lname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Lid == other.Lid && Objects.equals(Lname, other.Lname);
	}


}
