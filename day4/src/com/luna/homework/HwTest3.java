package com.luna.homework;

import java.util.Scanner;

// 1-1/2+1/3......
public class HwTest3 {
	public static void main(String[] args) {
		// if문은 조건문이니깐 한번하니깐 for문으로
		//



		Scanner sc = new Scanner(System.in);
		System.out.println("높이를 입력하세요");
		int dept = Integer.parseInt(sc.nextLine());

		if (dept < 0 || dept > 10) {
			System.out.println("입력오류");
		} else {

			for (int i = 1; i <= dept; i++) {
				for (int j = 1; j <= dept - i; j++) {
					System.out.print(" ");
				} // for j

				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				} // for j

				System.out.println();
			} // for i

		}

	}

}
