package com.luna.homework;

import java.util.Scanner;


public class HwTest4 {
	public static void main(String[] args) {

		int odd=0, even=0, tot=0;
	for(int i=1; i<=20; i++) {
		if(i%2==0) {
			//Â¦¼ö
			even+=i;
			
		}else {
			//È¦¼ö
			odd+=i;
			
		}
		
	}// for
	
	tot=odd+even;
	
	System.out.println("Â¦¼ö ÇÕ :" + even);
	System.out.println("È¦¼ö ÇÕ :" + odd);
	System.out.println("ÃÑ ÇÕ :" + tot);
	}

}
