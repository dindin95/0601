package com.luna.am;

public class IfTest2 {
	
	public static void main(String[] args) {
		
		int kor = 80;
				
		if(kor >=90) {
			
			System.out.println("수");
			
		}else if(kor >=80) {
			System.out.println("우");
		}else if(kor >=70) {
			System.out.println("미");
		}else if(kor >=60) {
			System.out.println("양");
		}else
			System.out.println("가"); // 조건이 1개면 브레이스를 안써도됨 자유
		
			
	}

}
