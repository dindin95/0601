package com.luna.pm;

class Access1 {

	private int su; // ĸ��ȭ ��Ŵ

	Access1(int su) {

		if (su < 0) {
			
			su = 0;
		}
		this.su = su;
		
	}//������ 
	
	void prt() {
		System.out.println("su :" + su);
	}
	

}// class Access1

public class AccessTest {

	public static void main(String[] args) {

	//	Access1 ins = new Access1();

		/*
		 * ins.su=-100; System.out.println(ins.su); // private ������ ���ٸ���
		 */
		
		Access1 ins = new Access1(10);
        

	}

}
