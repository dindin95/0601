package com.luna.am;

import java.util.Scanner;

public class HwOperation2 {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오");		
		String name = sc.nextLine();
		System.out.println("input kor");
		int kor = Integer.parseInt(sc.nextLine());
		
		System.out.println("input eng");		
		int eng = Integer.parseInt(sc.nextLine());
		System.out.println("input math");
		int math = Integer.parseInt(sc.nextLine());
		
		int tot = kor+eng+math;
		float avg=tot/3.0f; // tot/3 -> 100/3 => 33 => 33.0
		//앞에가 int고 뒤에도 int 하면 int로 형변환 된다
		// float avg = (float) tot/3;
		
		String result=""; // 초기값 잡아준거
		if(avg>=60)
			result="합격";
		else
			result="불합격";
		
		System.out.println("name : " + name);
		System.out.println("kor : " + kor);
		System.out.println("math : " + math);
		System.out.println("tot : " + tot);
	//	System.out.println("avg : " + name);
		System.out.printf("avg:%.2f\n" ,avg); //소수 2째자리수까지 할려면
		
		System.out.println("결과 : " + result);
		
		
		
		
		
	}

}
