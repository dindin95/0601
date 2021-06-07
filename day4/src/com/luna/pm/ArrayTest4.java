package com.luna.pm;

import java.util.Scanner;

//문자열 여러개로 구성된 예제
public class ArrayTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		String[] name = new String[5];		
//		System.out.println("이름을 입력하세요");
//		name[0]=sc.nextLine();
//		System.out.println("이름을 입력하세요");
//		name[1]=sc.nextLine();
//		System.out.println("이름을 입력하세요");
//		name[2]=sc.nextLine();
//		System.out.println("이름을 입력하세요");
//		name[3]=sc.nextLine();
//		System.out.println("이름을 입력하세요");
//		name[4]=sc.nextLine();
//
//		for(int i = 0; i<name.length; i++) {
//			System.out.println(name[i]);
//			
//		}
		
		
		System.out.println("몇명인가요");
		int person = Integer.parseInt(sc.nextLine());
		String name[] = new String[person];
		
		for(int i = 0; i<name.length; i++) {
			System.out.println("이름 입력해주세요");
			name[i]=sc.nextLine();					
		}

		System.out.println("name");
		System.out.println("========");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}

	}

}
