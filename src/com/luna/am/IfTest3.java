package com.luna.am;

import java.util.Scanner;

public class IfTest3 {
	
	public static void main(String[] args) {
		

	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수는");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어 점수는");
		int eng = Integer.parseInt(sc.nextLine());
		
		if(kor >= 90) {
			if(eng >= 90) {
			//kor eng 모두 90 이상이면 very good
			System.out.println("very good");
			}else
			//kor eng 중 하나라도 90이상이면 good
				System.out.println("good");
		}else {
			if(eng >= 90) {
				//kor eng 중 하나라도 90이상이면 good
				System.out.println("good");
				
			}else{
				//둘다 90이 안되면 bed
				System.out.println("bed");
			}
			
			
		}
		
		
			
	}

}
