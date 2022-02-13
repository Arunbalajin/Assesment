package com.collabera.Assesment;

import java.util.Objects;

public class Person {
	
	private int Eid;
	private String Ename;
	@Override
	public int hashCode() {
		return Objects.hash(Eid, Ename);
	}
	public Person() {
		super();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Eid == other.Eid && Objects.equals(Ename, other.Ename);
	}
	public Person(int eid, String ename) {
		super();
		Eid = eid;
		Ename = ename;
	}
	@Override
	public String toString() {
		return "Person [Eid=" + Eid + ", Ename=" + Ename + "]";
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}

	}

