package com.luna.pm;
//String : 클래스다 클래스도 배열을 만들 수 있다

class Arr2 {

	public void view(String name) {
		System.out.println(name);
	}

	public void view2(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}

	public void view3(int[] arr) {

//		// arr 배열을 출현하는 메서드 구현   뒤에는 배열이름 앞에는 구성요소를 써야됨
//		for (int index : arr) {
//			System.out.println(index);
//		}// for

		// 0부터 시작하니깐 i<= 하면 안됨
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

public class ArrTest2 {

	public static void main(String[] args) {
		// 결과 hello란 결과과 나오도록 view를 호출

		Arr2 ins = new Arr2();// 객체 생성

		String content = "hello";// 변수만듬
		ins.view(content);// 변수 만들어서 넣음
		ins.view("hello");

		System.out.println("== view2 메서드 호출해서 홍길동 20 출력해라 ==");
		ins.view2("홍길동", 20);

		System.out.println("== view3 메서드 호출 10 30 50 ==");
		ins.view3(new int[] { 10, 30, 50 });

//		int[] arr = new int[3];
//		arr[0] = 10;
//		arr[1] = 30;
//		arr[2] = 50;

		int[] arr = { 10, 30, 50 };

	}

}
