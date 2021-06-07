package com.luna.homework;

import java.util.Scanner;

public class FiboTest {
	
	public static void main(String[] args) {
		int a1 = 1;
		int a2 = 1;
		int a3;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input num");
		int num = Integer.parseInt(scanner.nextLine());
		System.out.println(a1+"\t");
		System.out.println(a1+"\t");
	   //5
		for(int i =1; i<=5; i++) {
			
			a3=a1+a2;
			System.out.println(a3+"\t");
			a1=a2;
			a2=a3;
		}// i for
		
	}

}
