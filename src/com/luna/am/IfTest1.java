package com.luna.am;

import java.util.Scanner;

public class IfTest1 {
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("input kor");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.println("input eng");
		int eng = Integer.parseInt(sc.nextLine());
		
		if(kor >= 90) {
			if(eng >= 90)
				System.out.println("kor 90 �̻� eng 90�̻�");
			else
				System.out.println("kor 90 �̻� eng 90�̸�");
		}else {
			if(eng>=90)
				System.out.println("kor 90 �̸� eng 90�̻�");
			else
				System.out.println("kor 90 �̻� eng 90�̸�");
			
			
		}
		
			
	}

}
