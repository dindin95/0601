package com.luna.am;

/*
�ļ��� �����ε�(OverLoading)
Ŭ���������� �����ڸ� ������ �����ϴ°�

������ �̸��� ���ƾߵȴ�
�Ű����� Ÿ��&����&���� �޶�� �ȴ� (�����̸��ϰ� �������)
�ٸ� �����ڷ� �ν� 

this ->�������� this��� �Ѵ�
�������� �Ű����� 
���������ϰ� �ν��Ͻ��ϰ� ������ this��� ����
*/

class Person3{
	
	String name;
	int age;
	String juso;
	
	Person3(String name, int age, String juso){ //������
		
		
		//name =n  n���� name�� �Ѱ���
		this.name =name;
		this.age =age;
		this.juso =juso;//���������ϰ� �ν��Ͻ������� ������ this�� ��
		
	}//������ ������ ������ �������� ���
	
	//�̸��� ���̸� �ʱ�ȭ �� �����ڸ� �����Ͻÿ�
	Person3(int age,String name){//������
		this.age=age;
		this.name=name;
	}
	
	//�̸��� �ּҸ� �ʱ�ȭ �� �����ڸ� �ۼ��Ͻÿ�
	Person3(String name,String juso){//������
		this.name=name;
		this.juso=juso;
	}
		
	//��¸޼���
	void print() {
		System.out.println("�̸� :" +name);
		System.out.println("�̸� :" +age);
		System.out.println("�̸� :" +juso);
	}
}


public class ConstrutorTest {
	public static void main(String[] args) {
		
		//��ü����
		Person3 ins = new Person3("kim",20,"seoul");//�ŰԺ���3���� ��ü�� ����
		ins.print();
		
	}

}
 