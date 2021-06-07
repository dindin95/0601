package day1;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {

		char a='a';
		String b="abc";
		
		System.out.println("이름을 입력하세요");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름입력");
//		String name = sc.nextLine();
//		System.out.println("국어입력");
//		int kor=Integer.parseInt(sc.nextLine());
//		
//		System.out.println("이름"+ name);
//		System.out.println("국어"+kor);
//		
		
		Scanner input = new Scanner(System.in);
		System.out.println("이름 :");
		String name2 = input.nextLine();
		System.out.println("국어입력");
		int kor = Integer.parseInt(input.nextLine());
		int eng = Integer.parseInt(input.nextLine());
		int mat = Integer.parseInt(input.nextLine());
		int total = kor + eng + mat;
		int ave = (kor + eng + mat)/3;
		System.out.println("이름 : " + name2);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("토탈 : " + total);
		System.out.println("평균 : " + ave);
		
	}

}
