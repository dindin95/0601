package com.luna.pm;

import java.util.Scanner;

public class For2Test {

	public static void main(String[] args) {
		
	//	1 2 3 4 5 --->����
	//	1 2 3 4 5 --->�� �ٱ���
	//	1 2 3 4 5 --->���� �ٱ���
		
//		for(int i= 1; i <=3 ; i++) {
//			
//			for(int j=1 ; i <= 5 ; j++) {
//				System.out.println(j);
//			}// ���� for��
//			
//			System.out.println(); // i�� ����� �ȵǴϱ� 1~5 �� 3�� ����
//		}

		

		//1 1 1 1   
		//2 2 2 2
		//3 3 3 3
		for(int i= 1; i <=3 ; i++) {
			
			for(int j=1 ; j <= 4 ; j++  ) {
				System.out.print(i); // j�� �ϸ� 1234 1234 1234 �̷��Ե�
			}// ���� for��
			
			System.out.println(); // i�� ����� �ȵǴϱ� 1~5 �� 3�� ����
		}


	}

}
