package com.luna.pm;
/*
���� ������
private : Ŭ������������ ����
default
protected
public : ��ü����
*/
public class AccessTest2 {
	
	public static void main(String[] args) {
		
		Access2 ins = new Access2("hong");
		//ins.name="hong" -> �����Ͽ���
		
		System.out.println(ins.getName());
		ins.setName("kim");
	}

}
