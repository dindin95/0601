package com.luna.homework;

import java.util.Scanner;

// while - + - +
//       - + - +
public class HwTest2_2 {
	public static void main(String[] args) {
		// while - + - +
		// - + - +
		Scanner sc = new Scanner(System.in);
		System.out.println("input choice");
		String choice = sc.nextLine();

		int i = 1;
		if (choice.equals("1")) {

			while (i <= 2) {
				int j = 1;
				while (j <= 4) {
					if (j % 2 == 0)
						System.out.print("+");
					else
						System.out.print("-");
					j++;

				} // while j
				System.out.println();
				i++;
			} // while i

		} else if (choice.equals("2")) {
			while (i <= 2) {
				int j = 1;
				while (j <= 4) {
					if (j % 2 == 0)
						System.out.print("+");
					else
						System.out.print("-");
					j++;

				}
				System.out.println();
				i++;
			}

		} else {
			System.out.println("입력오류!!!");
		}

	} // main

}
