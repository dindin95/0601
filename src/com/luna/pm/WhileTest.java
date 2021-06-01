package com.luna.pm;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {

		// 8 7 6 5 4 => while하고 for문

		int num = 8;

		while (num > 3) {
			
			for (int i = num; i > 3; i--) {		
				System.out.println(i);
			} // num값을 대입을 안해줘서 무한루프
			
		    
		}
			
			

//			int i = 8;
//			while (i >= 4) {
//				System.out.println(i);
//			} // 대입을 안해줘서 무한루프
//
//			System.out.println("=========");
//
//			int a = 9;
//			while (a > 2) {
//
//				System.out.println(a);
//				// y=y-2;
//				a -= 2;
//
//			}
//		}
	}

}
