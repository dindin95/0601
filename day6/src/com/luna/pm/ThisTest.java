package com.luna.pm;


class Person1{
	
	int num = 20;
	
	Person1(int num){
		
//		num+=num; 
//		System.out.println(num); // 100
		
		
//		this.num+=num;
//		System.out.println(num);//50
		
//		this.num+=num;
//		System.out.println(this.num); //70
		
		num+=num;
		System.out.println(this.num); //20
	}
	
}

public class ThisTest {
	
	public static void main(String[] args) {
		
		Person1 ins= new Person1(50);
	}

}
