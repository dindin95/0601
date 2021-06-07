package com.luna.am;

/*
생성자
클래스 이름과 같은 이름의 메서드 모양

클래스 이름 () {
	
}

리턴 타입을 쓰면 안됨 !!

*/

class Student{
	String name;
	
	Student(String n){ // 생성자: 객체를 만드는 자 모양 Constructor
		name=n;
	}
	
}

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student p1 = new Student("kim");
		System.out.println(p1.name);
	}

}
