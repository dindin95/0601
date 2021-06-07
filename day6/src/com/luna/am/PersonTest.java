package com.luna.am;

class Person {

	void t1() {
		System.out.println("t1");
	}

	void t2() {
		System.out.println("t2");
	}
	
	void t3() {
		//불러주는 순간에 t1,t2를 동작해야됨
		t1(); // 메소드 호출하는법
		t2();
	}
}

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.t1();
		p1.t2();
		
	    System.out.println("=======");
	    p1.t3();
	}

}
