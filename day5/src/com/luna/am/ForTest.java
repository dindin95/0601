package com.luna.am;

public class ForTest {
	
	public static void main(String[] args) {
		
		
		int[] arr = {10,20,30};
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//jdk5 이후
		
		
//		for(int index:arr)
//			System.out.println(index);

		String[] name = {"a","b","c"}; //하나하나를 원소라고 함
		for(String data:name) {
			System.out.println(data);
		}
		
	}

}
