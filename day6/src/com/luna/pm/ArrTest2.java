package com.luna.pm;
//String : Ŭ������ Ŭ������ �迭�� ���� �� �ִ�

class Arr2 {

	public void view(String name) {
		System.out.println(name);
	}

	public void view2(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}

	public void view3(int[] arr) {

//		// arr �迭�� �����ϴ� �޼��� ����   �ڿ��� �迭�̸� �տ��� ������Ҹ� ��ߵ�
//		for (int index : arr) {
//			System.out.println(index);
//		}// for

		// 0���� �����ϴϱ� i<= �ϸ� �ȵ�
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

public class ArrTest2 {

	public static void main(String[] args) {
		// ��� hello�� ����� �������� view�� ȣ��

		Arr2 ins = new Arr2();// ��ü ����

		String content = "hello";// ��������
		ins.view(content);// ���� ���� ����
		ins.view("hello");

		System.out.println("== view2 �޼��� ȣ���ؼ� ȫ�浿 20 ����ض� ==");
		ins.view2("ȫ�浿", 20);

		System.out.println("== view3 �޼��� ȣ�� 10 30 50 ==");
		ins.view3(new int[] { 10, 30, 50 });

//		int[] arr = new int[3];
//		arr[0] = 10;
//		arr[1] = 30;
//		arr[2] = 50;

		int[] arr = { 10, 30, 50 };

	}

}
