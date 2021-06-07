package day1;

public class OpTest9 {
	
	public static void main(String[] args) {

		//단항 연산자
		// ++a 전위 a++후위
		
		 int x = 10;
		 int y = ++x; // x= x+1 ->을 y에 대입
		 
		 System.out.println(x);
		 System.out.println(y);
		 
//		 y=++x;
//		 x=x+1;
//		 y=x;
		 
		 /////////
		 
		 x =10;
		 y = x++;
		 
		 System.out.println(x);
		 System.out.println(y);


	}

}
