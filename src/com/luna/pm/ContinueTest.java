package com.luna.pm;



public class ContinueTest {

	public static void main(String[] args) {
		
//		for(int i=1 ; i<5; i++) {
//			
//			if(i%2==0)
//				continue; // 밑에있는 문장을 동작 안하고 처음으로 올라감 
//			
//			System.out.println(i);
//		}
		
//		int i = 1;
//		
//		while(i<=5) {
//			
//			if(i%2==0)
//				continue; // 2가 나왔을때 continue니깐 위로올라가서 계속 반복
//			
//			System.out.println(i);
//			
//			i++;
//		} 1 찍히고 2에서 continue를 만나니깐 아무것도 안찍히고 계속 돌아감
			
//		int i = 1;
//		
//		while(i<=5) {
//		
//			System.out.println(i);
//			
//			if(i%2==0)
//				continue;
//			
//			i++;
//		} // 1 2 2 2 2 2 2
		
		
//		int i = 1;
//		
//		while(i<=5) {
//		
//			System.out.println(i);
//			
//			i++;
//			
//			if(i%2==0)
//				continue;
//			
//			
//		} // 1 2 3 4 5

		
		//  1 3 5 
		
		
		
		int i = 0;
		while(i < 5) {
			
			i++;
			if(i%2==0)
				continue;
			System.out.println(i);
		}
		
	}

}
