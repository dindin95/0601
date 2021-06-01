package com.luna.pm;

import java.util.Scanner;

public class For2Test {

	public static void main(String[] args) {
		
	//	1 2 3 4 5 --->안쪽
	//	1 2 3 4 5 --->그 바깥쪽
	//	1 2 3 4 5 --->제일 바깥쪽
		
//		for(int i= 1; i <=3 ; i++) {
//			
//			for(int j=1 ; i <= 5 ; j++) {
//				System.out.println(j);
//			}// 안쪽 for문
//			
//			System.out.println(); // i가 출력이 안되니깐 1~5 를 3번 돌음
//		}

		

		//1 1 1 1   
		//2 2 2 2
		//3 3 3 3
		for(int i= 1; i <=3 ; i++) {
			
			for(int j=1 ; j <= 4 ; j++  ) {
				System.out.print(i); // j로 하면 1234 1234 1234 이렇게됨
			}// 안쪽 for문
			
			System.out.println(); // i가 출력이 안되니깐 1~5 를 3번 돌음
		}


	}

}
