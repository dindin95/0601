package com.luna.am;

/*
생성자: 객체를 만드는 자 모양 (Constructor)

생성자 만드는 방법
클래스이름과 동일한 이름의 메서드 모양, 단 리턴타입이 없어야됨

호출시점:
new할때 자동으로 호출
객체 만들어질때(new) 자동으로 호출
	
사용이유 : 
객체의 인스턴스 변수들을 초기화 하기 위해
객체가 만들어지면서 해야 할 기술
		
1.객체를 만들기 위해서는 반드시 생성자가 필요하다 ===> ㅇ
2.객체를 만들기 위해서는 생성자도 필요하지만 없어도 된다. ===> x
		
*/



class Student2 {
	//객체를 만들기 위해서는 반드시 생성자가 필요하다

	Student2(int su1) {

		System.out.println("생성자 호출 : " + su1);
	}
	
	Student2(){
		System.out.println("생성자 - noArguement ");
	}
	
//	void Student2(){ ====>생성자 아님 메서드임
//		System.out.println("생성자 - noArguement ");
//	}
	
	Student2(String name){
		System.out.println("생성자 - 매개변수(파라미터)가 String 타입");
	}
}

public class StudentTest2 {
	//객체를 만들기 위해서는 반드시 생성자가 필요하다

	public static void main(String[] args) {
		Student2 ins = new Student2(10);
		Student2 ins2 = new Student2();
		Student2 ins3 = new Student2("hong");

	}

}
