package com.luna.pm;

class Student {

	String where = "park";

	String walk() {

		System.out.println("걸어값니다");
		String name = "aaa";

		return "walking";
		// 불러줄때 아무값도 안가지고 갈꺼야 그럼
	}
}

//attribute:속성  
//=>속성을 가져오기 위해서는 변수가 필요함
public class StudentTest {

	public static void main(String[] args) {

		Student s = new Student(); // 객체생성
		s.where = "park";
		String data = s.walk();
	   System.out.println(data);

	}

}
