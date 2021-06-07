package com.luna.pm;

import java.util.Scanner;

class A {

	void par(String name2) { // 파라미터로 갑을 던져줬으니깐
		System.out.println("what your name" + name2); // 출력만 받을려면
	}

	String peple(int names) {

		String ages = "";

		if (names < 20) {
			ages = "10대";
		} else if (names < 30) {
			ages = "20대";
		} else if (names < 40) {
			ages = "30대";
		} else if (names < 50) {
			ages = "40대";
		} else if (names < 60) {
			ages = "50대";
		} else if (names < 70) {
			ages = "60대";

		} else
			ages = "70대~";
			
			
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
		// ins.par(name); // name값 받은거 넘겨주는거
		
		System.out.println(ins.peple(age)); //
		String degree=ins.peple(age); // 다시 쓸 수 도 있어서 변수로 잡은거다

		System.out.println(degree);
	}

}
