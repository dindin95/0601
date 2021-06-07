package com.luna.homework;

import java.util.Scanner;

// 1-1/2+1/3......
public class HwTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("input su");
		int su = Integer.parseInt(sc.nextLine());
		String data = "";
		float result = 0;

		for (int i = 2; i <= su; i++) {
			if (i % 2 == 0) {
				data += " - /1" + i;
				result -= 1.0f / i;
			} else {
				data += " + /1" + i;
				result += 1.0f / i;
			}

		} // for
		
		System.out.println(data+"="+result);
		
		
		System.out.println("=============");
		
		int i=2;
		while(i<=su) {
			if(i%2==0) {
				data+="-1/"+i;
				result-=1.0f/i;
			}else {
				data+="+1/"+i;
				result+=1.0f/i;
			}
			i++;
		}//while

	}

}
