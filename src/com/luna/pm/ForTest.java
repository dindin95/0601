package com.luna.pm;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {

		// 4~ 20까지 짝수값을 출력하시오
		for (int i = 4; i <= 20; i += 2) {
			System.out.print(i + " ");
		} // end for

		
		// num에서부터 num2까지 출력하고 합을 구하시오
		System.out.println("============");
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("앞전 숫자보다 더 크게 입력하세요");
		int num2 = Integer.parseInt(sc.nextLine());


		int sum = 0;
		
		for( int i = num ; i <=num2 ; i++) {
			sum = sum+ i ; // sum+=i ;
			System.out.print(i + " ");
		}

		System.out.println("\n" + "합계 : " + sum);
	}

}
