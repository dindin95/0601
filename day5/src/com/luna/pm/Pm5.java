package com.luna.pm;


class AAA{
	int age;
}
public class Pm5 {

	public static void main(String[] args) {
		
		AAA aaa = new AAA();
		AAA bbb = new AAA();
		
		
		aaa.age=10;
		bbb.age=20;
		
		System.out.println(aaa.age +" " + bbb.age);
		
		aaa=bbb;
		
		System.out.println(aaa.age +" " + bbb.age);
	}
	

}
