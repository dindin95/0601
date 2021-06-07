package day1;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	       
	       System.out.println("이름을 입력하세요");
	       String name=sc.nextLine();
	       System.out.println("국어를 입력하세요");
	       int kor=Integer.parseInt(sc.nextLine());
	       System.out.println("영어를 입력하세요");
	       int eng=Integer.parseInt(sc.nextLine());
	       System.out.println("수학을 입력하세요");
	       int math=Integer.parseInt(sc.nextLine());
	        
	       int tot=kor+eng+math;
	        //float avg=(float)tot/3;
	       float avg= tot/3.0f;
	 
	        System.out.println("이름 :"+name);
	        System.out.println("국어 : "+kor); 
	        System.out.println("수학 :"+math);
	        System.out.println("영어 :"+eng);
	        System.out.println("총점 :"+tot);
	        System.out.println("평균 :"+avg);
	        
	        //평균 점수가 60점 이상이면 합격 아니면 불합격

	    
	        
	        if ( avg >=60) {
	        	System.out.println("합격입니다");
	        }else {
	        	System.out.println("불합격입니다");
	        }
		}
}
