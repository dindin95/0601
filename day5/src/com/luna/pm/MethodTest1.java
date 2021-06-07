package com.luna.pm;


class Person2{
	void prt()
	{
		System.out.println("prt method call");
	}
	void draw(String data) {
		
		System.out.println(data+"input ");
	}
	void cal(int a, float b, long c, char d, String e) { //매개변수
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	void think(int su,int su2) {
		
	}
}

public class MethodTest1 {
	
	public static void main(String[] args) {
		
		Person2 ins = new Person2();
		ins.prt();
		ins.draw("coin");
		ins.cal(10,20.1f,30L,'a',"ss");
		
		int data1=10;
		int data2=20;
		
		ins.think(data1,data2);

	}

}
