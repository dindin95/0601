package com.luna.am;

class Man {

	String name;
	String addr;
	int age;

//	void eat() {
//		
//	}
//	
//	boolean sleep(int a) {
//		
//		return true;
//		
//	}
//	
//	void walk() {
//		
//	}
//	
//	void talk(int b) {
//		
//	}
}// man

public class ManTest {

	public static void main(String[] args) {

		Man m1 = new Man();
		Man m2 = new Man();

//		m1.name ="ȫ�浿";
//		m1.age=10;
//		m1.addr="����";
//		m2.name ="ȫ���";
//		m2.age=20;
//		m2.addr="���";
//
//		
//		
//		System.out.println(m1.name+","+m1.age+","+m1.addr);
//		System.out.println(m2.name+","+m2.age+","+m2.addr);

		m1 = m2;
		m1.name = "hong";
		m2.name = "kim";
		System.out.println(m1.name);
		System.out.println(m2.name);
		System.out.println(m1 == m2);

		Man m3 = new Man();

		System.out.println("======");
		System.out.println(m1 == m2);
		System.out.println(m1 == m3);
		System.out.println("======");		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));

	}

}
