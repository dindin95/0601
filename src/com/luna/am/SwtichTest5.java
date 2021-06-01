package com.luna.am;

import java.util.Scanner;

public class SwtichTest5 {

	public static void main(String[] args) {

		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);

		int num = Integer.parseInt(sc.nextLine());

//		switch (num/10) {
//		case 9 :
//			System.out.println("수");
//		 break;
//			
//		case 8:
//			System.out.print("우");
//			 break;
//		case 7:
//			System.out.print("미");
//			break;
//		case 6:
//			System.out.println("양");
//			break;
//		default:
//			System.out.println("가");
//		}// end switch

		int su = 99;

		switch (su / 10) {
		//switch => byte short int char String
		// switch 식,변수 => int관련 ,String 관련 enum

		case 10:
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.print("우");
			break;
		case 7:
			System.out.print("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default:
			System.out.println("가");
		}// end switch

	}// end main

}// end class
