package com.luna.am;

import java.util.Scanner;

public class LoopTest1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���");
		int dept=Integer.parseInt(sc.nextLine());

		int k=1;
		
		for(int i=1; i<=dept; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(k+"\t");
				k+=2;
			}//j
			System.out.println();
			
		}//i
		
	}

}
