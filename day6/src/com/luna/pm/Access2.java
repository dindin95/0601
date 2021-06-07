package com.luna.pm;

public class Access2 {

	private String name;

	public Access2(String name) {
		this.name = name;
	}

	// name값을 변경할 수 있는 기능 getter setter 
	
	//값 변경이니깐 가져올 필요 없을
	public void setName(String name) {
		this.name = name;
	}

	//값을 가져와야되니깐 return
	public String getName() {
		return name;
	}

	public void prt() {
		System.out.println(name);
	}
}
