package com.luna.pm;

class Student {

	String where = "park";

	String walk() {

		System.out.println("�ɾ�ϴ�");
		String name = "aaa";

		return "walking";
		// �ҷ��ٶ� �ƹ����� �Ȱ����� ������ �׷�
	}
}

//attribute:�Ӽ�  
//=>�Ӽ��� �������� ���ؼ��� ������ �ʿ���
public class StudentTest {

	public static void main(String[] args) {

		Student s = new Student(); // ��ü����
		s.where = "park";
		String data = s.walk();
	   System.out.println(data);

	}

}
