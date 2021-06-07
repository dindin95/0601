package com.luna.am;

import java.util.Scanner;

public class LoopTest5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input");
		int num = Integer.parseInt(sc.nextLine());

		int k = 1;
		for (int i = 5; i >= 1; i--) {
			// ฐ๘น้
			for (int j = num; j >= i; j--) {
				System.out.print("\t");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(k+"\t");
				k+=2;

			}
			System.out.println();
		}

	}

}
