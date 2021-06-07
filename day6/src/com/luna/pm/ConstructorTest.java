package com.luna.pm;

/*
�Ļ��� -> ��ü �����ϱ� ���ؼ� ���°�

�ļ��� �����ε�(OverLoading)
Ŭ���������� �����ڸ� ������ �����ϴ°�

������ �̸��� ���ƾߵȴ�
�Ű����� Ÿ��&����&���� �޶�� �ȴ� (�����̸��ϰ� �������)
�ٸ� �����ڷ� �ν� 

this ->�������� this��� �Ѵ�
�������� �Ű����� 
���������ϰ� �ν��Ͻ��ϰ� ������ this��� ����

������ȣ��
������ ������ ������ ȣ���� �Ѵ�
������ ������ ������� �����ڸ� ȣ��
*/

class Person4 {
	
	//new �ϸ鼭 ��ü�� ��������ϱ� �ν��Ͻ� ������ �Ȱ���
	//class�� �޸𸮰� �ȸ������
	//class �ȿ� ���� ������ �������
	//��ü�� ��������ŷ� ��ü�ȿ� �ִ� ���� �ν��Ͻ�����
	String name; //�������
	int age;
	String addr;
	String phone;

	Person4(String name, int age, String addr, String phone) {

		//�����ڿ��� ������ ȣ���Ҷ� ��ù��°���� ȣ���ؾߵȴ�
		this(name, age, addr);//3��¥�� ������ ȣ�� 3ȣ���Ѱ� ������ �ؿ��� ���� ������ this
		this.phone = phone; //�������� this
		
		
//		System.out.println("������ - �Ű����� 4");
	}

	Person4(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
//		System.out.println("������ - �Ű����� 3");
	}

	Person4(String name, int age) {

		this(name);
		this.age = age;
	}
	

	Person4(String name) {

		this.name = name;
		
	}
	
	//��������� ����ϴ� �޼��� 
	//��¸� �Ҳ��ϱ� void
	void print(){
		System.out.println("name : "+name);
		System.out.println("age : " + age);
		System.out.println("addr : " + addr);
		System.out.println("phone : " + phone);
	}

}// Person4

public class ConstructorTest {

	public static void main(String[] args) {

		Person4 ins = new Person4("kom", 20, "seoul", "1111"); // 4��¥�� ������ ȣ��

		ins.print();
	}

}
