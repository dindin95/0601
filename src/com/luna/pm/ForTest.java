package com.luna.pm;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {

		// 4~ 20���� ¦������ ����Ͻÿ�
		for (int i = 4; i <= 20; i += 2) {
			System.out.print(i + " ");
		} // end for

		
		// num�������� num2���� ����ϰ� ���� ���Ͻÿ�
		System.out.println("============");
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("���� ���ں��� �� ũ�� �Է��ϼ���");
		int num2 = Integer.parseInt(sc.nextLine());


		int sum = 0;
		
		for( int i = num ; i <=num2 ; i++) {
			sum = sum+ i ; // sum+=i ;
			System.out.print(i + " ");
		}

		System.out.println("\n" + "�հ� : " + sum);
	}

}
