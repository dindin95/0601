package com.luna.am;

enum Week1{
	Sun,Mon,Tue,Wed,Tur,Fri,Sat
	
}

public class EnumTest {
//열거형은 enum	
	public static void main(String[] args) {
		Week1 w = Week1.Wed;
		
		switch (w) {
		case Sun:
			System.out.println("일욜입니다");			
			break;
		case Mon:
			System.out.println("월욜입니다");			
			break;
		default:
			System.out.println("나머지 요일입니다");
			break;
		}
		
	}

}
