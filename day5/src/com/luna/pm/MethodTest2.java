package com.luna.pm;

import java.util.Scanner;

class A {

	void par(String name2) { // �Ķ���ͷ� ���� ���������ϱ�
		System.out.println("what your name" + name2); // ��¸� ��������
	}

	String peple(int names) {

		String ages = "";

		if (names < 20) {
			ages = "10��";
		} else if (names < 30) {
			ages = "20��";
		} else if (names < 40) {
			ages = "30��";
		} else if (names < 50) {
			ages = "40��";
		} else if (names < 60) {
			ages = "50��";
		} else if (names < 70) {
			ages = "60��";

		} else
			ages = "70��~";
			
			
			return ages;

	}

}//A

public class MethodTest2 {

	public static void main(String[] args) {
		A ins = new A();

		Scanner scanner = new Scanner(System.in);
		System.out.println("input name");
		//String name = scanner.nextLine();
		int age = Integer.parseInt(scanner.nextLine());
		// ins.par(name); // name�� ������ �Ѱ��ִ°�
		
		System.out.println(ins.peple(age)); //
		String degree=ins.peple(age); // �ٽ� �� �� �� �־ ������ �����Ŵ�

		System.out.println(degree);
	}

}
