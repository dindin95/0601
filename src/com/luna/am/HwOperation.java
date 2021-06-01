package com.luna.am;

import java.util.Scanner;

public class HwOperation {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input num");		
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("input num2");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("input num3");
		int num3 = Integer.parseInt(sc.nextLine());
		//타입 변수 (조건) ? 참: 거짓;
		
		int max = (num>num2)? num: num2;
		
		max = (max>num2)? max: num2;
		
		int min=(num<num2)? num:num2;
		min=(min<num2)?min : num2;
		
		System.out.println("최대값 : " + max);
		System.out.println("최대값 : " + min);
		
		
	}

}
