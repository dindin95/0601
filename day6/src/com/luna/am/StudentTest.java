package com.luna.am;

/*
������
Ŭ���� �̸��� ���� �̸��� �޼��� ���

Ŭ���� �̸� () {
	
}

���� Ÿ���� ���� �ȵ� !!

*/

class Student{
	String name;
	
	Student(String n){ // ������: ��ü�� ����� �� ��� Constructor
		name=n;
	}
	
}

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student p1 = new Student("kim");
		System.out.println(p1.name);
	}

}
