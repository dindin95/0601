package day1;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {

		char a='a';
		String b="abc";
		
		System.out.println("�̸��� �Է��ϼ���");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�̸��Է�");
//		String name = sc.nextLine();
//		System.out.println("�����Է�");
//		int kor=Integer.parseInt(sc.nextLine());
//		
//		System.out.println("�̸�"+ name);
//		System.out.println("����"+kor);
//		
		
		Scanner input = new Scanner(System.in);
		System.out.println("�̸� :");
		String name2 = input.nextLine();
		System.out.println("�����Է�");
		int kor = Integer.parseInt(input.nextLine());
		int eng = Integer.parseInt(input.nextLine());
		int mat = Integer.parseInt(input.nextLine());
		int total = kor + eng + mat;
		int ave = (kor + eng + mat)/3;
		System.out.println("�̸� : " + name2);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + mat);
		System.out.println("��Ż : " + total);
		System.out.println("��� : " + ave);
		
	}

}
