package com.luna.pm;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance =0;
		
		Scanner sc = new Scanner(System.in);
		
	    
		
		while(run) {
			System.out.println("=============================");
			System.out.println("1.���� | 2.��� | 3.��ȸ | 4.����");
			System.out.println("=============================");
			
			System.out.println("���� ==>");
			
			String ch = sc.nextLine();
			
			int money =0;
			
			if(ch.equals("1")) {
				
			   System.out.println("���ݾ� : ");	   
			   money =Integer.parseInt(sc.nextLine());
			   balance+=money;
				
			}else if(ch.equals("2")) {
				
				 System.out.println("��ݾ� : ");
				 money -=Integer.parseInt(sc.nextLine());
				 balance-=money;
				 
			}else if(ch.equals("3")) {
				
				 System.out.println("�ܰ� : "+ balance);			
				
			}else if(ch.equals("4")) {
				
				break;
			}else {
				System.out.println("�ٽ� �Է����ּ���");
			}
				
				
		
			
			
		}
		

	   System.out.println("����Ǿ����ϴ�");
		
	}

}
