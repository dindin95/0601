package com.luna.pm;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance =0;
		
		Scanner sc = new Scanner(System.in);
		
	    
		
		while(run) {
			System.out.println("=============================");
			System.out.println("1.예금 | 2.출금 | 3.조회 | 4.종료");
			System.out.println("=============================");
			
			System.out.println("선택 ==>");
			
			String ch = sc.nextLine();
			
			int money =0;
			
			if(ch.equals("1")) {
				
			   System.out.println("예금액 : ");	   
			   money =Integer.parseInt(sc.nextLine());
			   balance+=money;
				
			}else if(ch.equals("2")) {
				
				 System.out.println("출금액 : ");
				 money -=Integer.parseInt(sc.nextLine());
				 balance-=money;
				 
			}else if(ch.equals("3")) {
				
				 System.out.println("잔고 : "+ balance);			
				
			}else if(ch.equals("4")) {
				
				break;
			}else {
				System.out.println("다시 입력해주세요");
			}
				
				
		
			
			
		}
		

	   System.out.println("종료되었습니다");
		
	}

}
