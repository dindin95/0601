package com.luna.am;

/*
������: ��ü�� ����� �� ��� (Constructor)

������ ����� ���
Ŭ�����̸��� ������ �̸��� �޼��� ���, �� ����Ÿ���� ����ߵ�

ȣ�����:
new�Ҷ� �ڵ����� ȣ��
��ü ���������(new) �ڵ����� ȣ��
	
������� : 
��ü�� �ν��Ͻ� �������� �ʱ�ȭ �ϱ� ����
��ü�� ��������鼭 �ؾ� �� ���
		
1.��ü�� ����� ���ؼ��� �ݵ�� �����ڰ� �ʿ��ϴ� ===> ��
2.��ü�� ����� ���ؼ��� �����ڵ� �ʿ������� ��� �ȴ�. ===> x
		
*/



class Student2 {
	//��ü�� ����� ���ؼ��� �ݵ�� �����ڰ� �ʿ��ϴ�

	Student2(int su1) {

		System.out.println("������ ȣ�� : " + su1);
	}
	
	Student2(){
		System.out.println("������ - noArguement ");
	}
	
//	void Student2(){ ====>������ �ƴ� �޼�����
//		System.out.println("������ - noArguement ");
//	}
	
	Student2(String name){
		System.out.println("������ - �Ű�����(�Ķ����)�� String Ÿ��");
	}
}

public class StudentTest2 {
	//��ü�� ����� ���ؼ��� �ݵ�� �����ڰ� �ʿ��ϴ�

	public static void main(String[] args) {
		Student2 ins = new Student2(10);
		Student2 ins2 = new Student2();
		Student2 ins3 = new Student2("hong");

	}

}
