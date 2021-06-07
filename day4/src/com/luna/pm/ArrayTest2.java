package com.luna.pm;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[3];

		System.out.println("input ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("input ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("input ");
		int c = Integer.parseInt(sc.nextLine());

		arr[0] = a;
		arr[1] = b;
		arr[2] = c;

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}
		
		// 입력할때마다
		for (int i = 0; i < arr.length; i++) {
			arr[i]= Integer.parseInt(sc.nextLine());
			
		}

	}

}
