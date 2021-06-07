package com.luna.pm;

class Sample {

	public void prt() {
		System.out.println("prt");
	}
}

public class SampleTest {

	public static void main(String[] args) {
		
		Sample ins = null;
		ins.prt(); // NullPointerException 
	}
}
