package com.luna.pm;

public class Access2 {

	private String name;

	public Access2(String name) {
		this.name = name;
	}

	// name���� ������ �� �ִ� ��� getter setter 
	
	//�� �����̴ϱ� ������ �ʿ� ����
	public void setName(String name) {
		this.name = name;
	}

	//���� �����;ߵǴϱ� return
	public String getName() {
		return name;
	}

	public void prt() {
		System.out.println(name);
	}
}
