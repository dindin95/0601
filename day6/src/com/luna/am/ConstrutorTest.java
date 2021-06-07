package com.luna.am;

/*
셍성자 오버로딩(OverLoading)
클래스내에서 생성자를 여러개 선언하는것

생성자 이름이 같아야된다
매개변수 타입&갯수&순서 달라야 된다 (변수이름하고 상관없다)
다른 생성자로 인식 

this ->참조변수 this라고 한다
생성자의 매개변수 
지역변수하고 인스턴스하고 같으면 this라고 쓴다
*/

class Person3{
	
	String name;
	int age;
	String juso;
	
	Person3(String name, int age, String juso){ //생성자
		
		
		//name =n  n값을 name에 넘겨줌
		this.name =name;
		this.age =age;
		this.juso =juso;//지역변수하고 인스턴스변수가 같을때 this를 씀
		
	}//생성자 끝나는 순간에 없어지는 얘들
	
	//이름과 나이를 초기화 할 생성자를 적성하시오
	Person3(int age,String name){//생성자
		this.age=age;
		this.name=name;
	}
	
	//이름과 주소를 초기화 할 생성자를 작성하시오
	Person3(String name,String juso){//생성자
		this.name=name;
		this.juso=juso;
	}
		
	//출력메서드
	void print() {
		System.out.println("이름 :" +name);
		System.out.println("이름 :" +age);
		System.out.println("이름 :" +juso);
	}
}


public class ConstrutorTest {
	public static void main(String[] args) {
		
		//객체만듬
		Person3 ins = new Person3("kim",20,"seoul");//매게변수3개인 객체를 만듬
		ins.print();
		
	}

}
 