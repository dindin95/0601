package com.luna.am;

import java.util.Scanner;

public class IfTest3 {
	
	public static void main(String[] args) {
		

	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.println("���� ������");
		int eng = Integer.parseInt(sc.nextLine());
		
		if(kor >= 90) {
			if(eng >= 90) {
			//kor eng ��� 90 �̻��̸� very good
			System.out.println("very good");
			}else
			//kor eng �� �ϳ��� 90�̻��̸� good
				System.out.println("good");
		}else {
			if(eng >= 90) {
				//kor eng �� �ϳ��� 90�̻��̸� good
				System.out.println("good");
				
			}else{
				//�Ѵ� 90�� �ȵǸ� bed
				System.out.println("bed");
			}
			
			
		}
		
		
			
	}

}
