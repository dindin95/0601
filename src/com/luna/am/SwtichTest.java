package com.luna.am;

import java.util.Scanner;

public class SwtichTest {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		
//		switch (num)
//		// 형변환 가능하니깐 byte short int
//		//()->안에는 int : byte short int char String
//		{
//		case 1:
//			System.out.println("1입니다");
//			break;
//		case 2:
//			System.out.println("2입니다");
//			break;
//		case 3:
//			System.out.println("3입니다");
//			break;
//
//		default:
//			System.out.println("나머지 경우");;
//		}
//		
		
		String data = "A";
		
		switch (data)
		// 형변환 가능하니깐 byte short int
		//()->안에는 int : byte short int char String
		{
		case "A":
			System.out.println("A입니다");
			break;
		case "B":
			System.out.println("B입니다");
			break;
		case "C":
			System.out.println("C입니다");
			break;

		default:
			System.out.println("나머지 경우");;
		} // end switch
		
			
	} // end main

} // end class
