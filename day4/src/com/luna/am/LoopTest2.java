package com.luna.am;

import java.util.Scanner;

public class LoopTest2 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("�������� �Է��ϼ���");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.println("�������� �Է��ϼ���");
		int math = Integer.parseInt(sc.nextLine());
		System.out.println("�������� �Է��ϼ���");
		int eng = Integer.parseInt(sc.nextLine());
		
		String score = "";
		
		if(kor>=90 && math>=90 && eng>=90) {
			score="excellent";
		}else if(kor>=90 || math>=90 || eng>=90){
			score="good";
			
		}else {
			score="bed";
		}
		
		
		System.out.println("�̸� : " + name +"��");
		System.out.print("���� : " + kor+"��");
		System.out.print(" ���� : " + math+"��");
		System.out.print(" ���� : " + eng+"��");
		
		System.out.println("\n���� : " + score);

		
	}

}
