package com.luna.pm;

/*
셍상자 -> 객체 생성하기 위해서 쓰는것

셍성자 오버로딩(OverLoading)
클래스내에서 생성자를 여러개 선언하는것

생성자 이름이 같아야된다
매개변수 타입&갯수&순서 달라야 된다 (변수이름하고 상관없다)
다른 생성자로 인식 

this ->참조변수 this라고 한다
생성자의 매개변수 
지역변수하고 인스턴스하고 같으면 this라고 쓴다

생성자호출
생성자 내에서 생성자 호출을 한다
생성자 내에서 만들어진 생성자를 호출
*/

class Person4 {
	
	//new 하면서 객체를 만들었으니깐 인스턴스 변수가 된거임
	//class는 메모리가 안만들어짐
	//class 안에 들어가는 변수를 멤버변수
	//객체가 만들어진거로 객체안에 있는 변수 인스턴스변수
	String name; //멤버변수
	int age;
	String addr;
	String phone;

	Person4(String name, int age, String addr, String phone) {

		//생성자에서 생성자 호출할때 맨첫번째에서 호출해야된다
		this(name, age, addr);//3개짜리 생성자 호출 3호출한거 끝난거 밑에꺼 읽음 생성자 this
		this.phone = phone; //참조변수 this
		
		
//		System.out.println("생성자 - 매개변수 4");
	}

	Person4(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
//		System.out.println("생성자 - 매개변수 3");
	}

	Person4(String name, int age) {

		this(name);
		this.age = age;
	}
	

	Person4(String name) {

		this.name = name;
		
	}
	
	//멤버변수를 출력하는 메서드 
	//출력만 할꺼니깐 void
	void print(){
		System.out.println("name : "+name);
		System.out.println("age : " + age);
		System.out.println("addr : " + addr);
		System.out.println("phone : " + phone);
	}

}// Person4

public class ConstructorTest {

	public static void main(String[] args) {

		Person4 ins = new Person4("kom", 20, "seoul", "1111"); // 4개짜리 생성자 호출

		ins.print();
	}

}
