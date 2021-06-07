package com.luna.am;

import java.util.Scanner;

public class LoopTest2 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("국어점수 입력하세요");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.println("수학점수 입력하세요");
		int math = Integer.parseInt(sc.nextLine());
		System.out.println("영어점수 입력하세요");
		int eng = Integer.parseInt(sc.nextLine());
		
		String score = "";
		
		if(kor>=90 && math>=90 && eng>=90) {
			score="excellent";
		}else if(kor>=90 || math>=90 || eng>=90){
			score="good";
			
		}else {
			score="bed";
		}
		
		
		System.out.println("이름 : " + name +"점");
		System.out.print("국어 : " + kor+"점");
		System.out.print(" 수학 : " + math+"점");
		System.out.print(" 영어 : " + eng+"점");
		
		System.out.println("\n점수 : " + score);

		
	}

}
