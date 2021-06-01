package com.luna.am;

public class ForTest2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "\t");
		}

		System.out.println("\n" + "======1====");

		for (int y = 5; y >= 1; y--) {
			System.out.println(y);
		}
		
		System.out.println("\n" + "=====2=====");
		
		for(int z = 1; z <=5 ; z++) {
			System.out.print(z +" ");
		}
		
		System.out.println("\n" + "=====3=====");
		
		// 1 3 5 7 9
		for(int i = 1 ; i <=9 ; i+=2) { // i++ i-- i+=2// i=i+2
			System.out.print(i + " ");
		}

		System.out.println("\n" + "=====4=====");
		// 10 8  6  4 
		for(int i=10 ; i > 2 ; i-=2){ //i-- , i-=2
			System.out.print(i + " ");
		}
		
		//10 8 6 4 
		System.out.println("\n" + "=====5=====");
		for( int i =10 ; i >=4 ; i --) {
			if(i%2 == 0) // 나머지가 0일때
			System.out.print(i + " ");
		}
	}

}
