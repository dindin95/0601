package com.luna.am;

enum Week1{
	Sun,Mon,Tue,Wed,Tur,Fri,Sat
	
}

public class EnumTest {
//�������� enum	
	public static void main(String[] args) {
		Week1 w = Week1.Wed;
		
		switch (w) {
		case Sun:
			System.out.println("�Ͽ��Դϴ�");			
			break;
		case Mon:
			System.out.println("�����Դϴ�");			
			break;
		default:
			System.out.println("������ �����Դϴ�");
			break;
		}
		
	}

}
