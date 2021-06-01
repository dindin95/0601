package com.luna.pm;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {

		System.out.println("While문 실행하기");
		int i = 10;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("=============");
		int a = 10;
		do {
			System.out.println(i);
			i++;

		} while (i < 10);
		
		//1 2 3 4 5 do while
		
		System.out.println("=============");
		
//		int b = 1;
		
//		do {
//			System.out.println(i);
//			i++;
//		}while(b < 6);
		
		int b = 5;
		
		do {
		System.out.println(i);
		i--;
	}while(b > 0);
	}

}
