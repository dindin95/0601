package com.luna.pm;


class Man{
	
	int age =10;
}


public class RefTest {
	
	public static void main(String[] args) {
		

		
		
		Man ins= new Man();
		Man ins2= new Man();
		
		System.out.println(ins==ins2); // false
		System.out.println(ins.age==ins2.age);//true
		
		Man ins3 = ins;
		System.out.println(ins3==ins); //true
	}

}
