package com.luna.pm;

import java.util.Scanner;

public class BreakTest2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String data = "";
		
//		int a =0;
//		
//		while(true) {
//			System.out.println("input a");
//			a=Integer.parseInt(sc.nextLine());
//			
//			if(a ==0)
//				break; // input 0일때 while빠져나옴
//			System.out.println(a);
//		}// while
//		
		
		while(true) {
			System.out.println("문자를 입력하세요");
			data = sc.nextLine();
			System.out.println(data);
			System.out.println("계속 입력할까요?");
			
			String yn = sc.nextLine();
			
			if(yn.equals("n")) //equals는 문자열일때 비교
				break;
		}

	}

}
