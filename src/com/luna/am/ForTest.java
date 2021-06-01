package com.luna.am;

public class ForTest {
	
	public static void main(String[] args) {
		
		for(int i=1 ; i<=5; i++)
			System.out.println("hello");
		
		
		for (int i = 10; i >=20; i++) // 지역변수 해당지역에서만 사용
			System.out.println(i);
		
		int su =1;
		for (; su <= 5; su++)
			System.out.println(su);
		
		System.out.println(su);
			
		
	}

}
