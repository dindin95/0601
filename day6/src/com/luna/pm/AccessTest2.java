package com.luna.pm;
/*
접근 지정자
private : 클래스내에서만 접근
default
protected
public : 전체공개
*/
public class AccessTest2 {
	
	public static void main(String[] args) {
		
		Access2 ins = new Access2("hong");
		//ins.name="hong" -> 컴파일오류
		
		System.out.println(ins.getName());
		ins.setName("kim");
	}

}
