package com.luna.pm;

import java.util.Scanner;

public class BreakTest2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String data = "";
		
//		int a =0;
//		
//		while(true) {
//			System.out.println("input a");
//			a=Integer.parseInt(sc.nextLine());
//			
//			if(a ==0)
//				break; // input 0�϶� while��������
//			System.out.println(a);
//		}// while
//		
		
		while(true) {
			System.out.println("���ڸ� �Է��ϼ���");
			data = sc.nextLine();
			System.out.println(data);
			System.out.println("��� �Է��ұ��?");
			
			String yn = sc.nextLine();
			
			if(yn.equals("n")) //equals�� ���ڿ��϶� ��
				break;
		}

	}

}
