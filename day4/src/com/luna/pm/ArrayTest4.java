package com.luna.pm;

import java.util.Scanner;

//���ڿ� �������� ������ ����
public class ArrayTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		String[] name = new String[5];		
//		System.out.println("�̸��� �Է��ϼ���");
//		name[0]=sc.nextLine();
//		System.out.println("�̸��� �Է��ϼ���");
//		name[1]=sc.nextLine();
//		System.out.println("�̸��� �Է��ϼ���");
//		name[2]=sc.nextLine();
//		System.out.println("�̸��� �Է��ϼ���");
//		name[3]=sc.nextLine();
//		System.out.println("�̸��� �Է��ϼ���");
//		name[4]=sc.nextLine();
//
//		for(int i = 0; i<name.length; i++) {
//			System.out.println(name[i]);
//			
//		}
		
		
		System.out.println("����ΰ���");
		int person = Integer.parseInt(sc.nextLine());
		String name[] = new String[person];
		
		for(int i = 0; i<name.length; i++) {
			System.out.println("�̸� �Է����ּ���");
			name[i]=sc.nextLine();					
		}

		System.out.println("name");
		System.out.println("========");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}

	}

}
