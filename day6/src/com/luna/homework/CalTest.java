package com.luna.homework;

import java.util.Scanner;

class Cal {

	int add(int num1, int num2) {

		return num1 + num2;
	}// add

	int sub(int num1, int num2) {

		return num1 - num2;

	}// sub

	String mul(int num1, int num2) {
		if (num2 == 0) {
			return "0으로 나눌 수 없습니다";
		} else if (num1 % num1 == 00) {
			return num1 / num2 + " ";
		} else
			return (float) num1 / num2 + "";

	}// mul

}

public class CalTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("input num1");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.println("input num2");
		int num2 = Integer.parseInt(scanner.nextLine());

		Cal ins = new Cal();
		ins.add(num1, num2);
		int result = ins.add(num1, num2);
		System.out.println("더하기 : " + result);
		System.out.printf("%d + %d=%d\n" + num1, num2, ins.add(num1, num2));
		System.out.printf("%d - %d=%d\n" + num1, num2, ins.add(num1, num2));
		System.out.printf("%d * %d=%d\n" + num1, num2, ins.add(num1, num2));
		System.out.printf("%d / %d=%s\n" + num1, num2, ins.add(num1, num2));
	}

}
