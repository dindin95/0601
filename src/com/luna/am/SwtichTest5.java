package com.luna.am;

import java.util.Scanner;

public class SwtichTest5 {

	public static void main(String[] args) {

		System.out.println("������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);

		int num = Integer.parseInt(sc.nextLine());

//		switch (num/10) {
//		case 9 :
//			System.out.println("��");
//		 break;
//			
//		case 8:
//			System.out.print("��");
//			 break;
//		case 7:
//			System.out.print("��");
//			break;
//		case 6:
//			System.out.println("��");
//			break;
//		default:
//			System.out.println("��");
//		}// end switch

		int su = 99;

		switch (su / 10) {
		//switch => byte short int char String
		// switch ��,���� => int���� ,String ���� enum

		case 10:
		case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.print("��");
			break;
		case 7:
			System.out.print("��");
			break;
		case 6:
			System.out.println("��");
			break;
		default:
			System.out.println("��");
		}// end switch

	}// end main

}// end class
