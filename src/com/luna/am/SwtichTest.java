package com.luna.am;

import java.util.Scanner;

public class SwtichTest {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		
//		switch (num)
//		// ����ȯ �����ϴϱ� byte short int
//		//()->�ȿ��� int : byte short int char String
//		{
//		case 1:
//			System.out.println("1�Դϴ�");
//			break;
//		case 2:
//			System.out.println("2�Դϴ�");
//			break;
//		case 3:
//			System.out.println("3�Դϴ�");
//			break;
//
//		default:
//			System.out.println("������ ���");;
//		}
//		
		
		String data = "A";
		
		switch (data)
		// ����ȯ �����ϴϱ� byte short int
		//()->�ȿ��� int : byte short int char String
		{
		case "A":
			System.out.println("A�Դϴ�");
			break;
		case "B":
			System.out.println("B�Դϴ�");
			break;
		case "C":
			System.out.println("C�Դϴ�");
			break;

		default:
			System.out.println("������ ���");;
		} // end switch
		
			
	} // end main

} // end class
