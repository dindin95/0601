package com.luna.pm;

public class ArrTest {
	
	public static void main(String[] args) {
		
	
		Arr ins = new Arr();
		
//		String[] arr = {"a","b","c"};
//		String[] arr = new String[3];
//		arr[0]="a";
//		arr[1]="b";
//		arr[2]="c";
//		
//		ins.prt(arr);
//		arr은 값
//		
//		String[] arr = new String[] {"kim","lee","park"};
//		참조변수 안넣고 할 수 있는방법 new String[] [값을 넣어주면 안됨]
		
		//중괄호() 안에 []를 못씀 
		ins.prt(new String[] {"a","b","c"});
		

	}

}
