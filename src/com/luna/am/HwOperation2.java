package com.luna.am;

import java.util.Scanner;

public class HwOperation2 {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��Ͻÿ�");		
		String name = sc.nextLine();
		System.out.println("input kor");
		int kor = Integer.parseInt(sc.nextLine());
		
		System.out.println("input eng");		
		int eng = Integer.parseInt(sc.nextLine());
		System.out.println("input math");
		int math = Integer.parseInt(sc.nextLine());
		
		int tot = kor+eng+math;
		float avg=tot/3.0f; // tot/3 -> 100/3 => 33 => 33.0
		//�տ��� int�� �ڿ��� int �ϸ� int�� ����ȯ �ȴ�
		// float avg = (float) tot/3;
		
		String result=""; // �ʱⰪ ����ذ�
		if(avg>=60)
			result="�հ�";
		else
			result="���հ�";
		
		System.out.println("name : " + name);
		System.out.println("kor : " + kor);
		System.out.println("math : " + math);
		System.out.println("tot : " + tot);
	//	System.out.println("avg : " + name);
		System.out.printf("avg:%.2f\n" ,avg); //�Ҽ� 2°�ڸ������� �ҷ���
		
		System.out.println("��� : " + result);
		
		
		
		
		
	}

}
