package com.luna.pm;

import java.util.Scanner;

//문자열 여러개로 구성된 예제
public class ArrayTest3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[4];
		
		name[0]="n1";
		name[1]="n2";
		name[2]="n3";
		name[3]="n4";
		
		for(int i = 0; i<name.length; i++) {
			System.out.println(name[i]);
			
		}



	}

}
