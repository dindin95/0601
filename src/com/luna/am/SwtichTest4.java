package com.luna.am;

import java.util.Scanner;

public class SwtichTest4 {
	
	public static void main(String[] args) {
		


		System.out.println("h , e, ll , o �� �ϳ��� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		String data  = "h";
		
//		switch (name) {
//		case "h":
//			System.out.println("hello");
//			break;
//		case "e":
//			System.out.println("ello");
//			break;
//		case "ll":
//			System.out.println("llo");
//			break;
//		case "o":
//			System.out.println("o");
//			break;
//		default:
//			System.out.println("�Է��� �߸��Ǿ����ϴ�");
//		}// end switch
		
		switch (data) {
		case "h":
			System.out.print("h");
			
		case "e":
			System.out.print("e");
			
		case "ll":
			System.out.print("llo");
			break;
		case "o":
			System.out.println("o");
			break;
		default:
			System.out.println("�Է��� �߸��Ǿ����ϴ�");
		}// end switch
			
	}// end main

}// end class
