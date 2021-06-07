package com.luna.pm;

class Person{
	String name;
	int age;
	String addr;
	
}



public class PersonTest {

	
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.name="luna";
		p1.age=20;
		p1.addr="경기";
		Person p2 = new Person();
		p2.name="kate";
		p2.age=20;
		p2.addr="서울";
		
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.addr);
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.addr);
		
		
		
	}
}
