package com.luna.homework;

import java.util.Scanner;

// 1-1/2+1/3......
public class HwTest3 {
	public static void main(String[] args) {
		// if���� ���ǹ��̴ϱ� �ѹ��ϴϱ� for������
		//



		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���");
		int dept = Integer.parseInt(sc.nextLine());

		if (dept < 0 || dept > 10) {
			System.out.println("�Է¿���");
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
