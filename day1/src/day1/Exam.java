package day1;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	       
	       System.out.println("�̸��� �Է��ϼ���");
	       String name=sc.nextLine();
	       System.out.println("��� �Է��ϼ���");
	       int kor=Integer.parseInt(sc.nextLine());
	       System.out.println("��� �Է��ϼ���");
	       int eng=Integer.parseInt(sc.nextLine());
	       System.out.println("������ �Է��ϼ���");
	       int math=Integer.parseInt(sc.nextLine());
	        
	       int tot=kor+eng+math;
	        //float avg=(float)tot/3;
	       float avg= tot/3.0f;
	 
	        System.out.println("�̸� :"+name);
	        System.out.println("���� : "+kor); 
	        System.out.println("���� :"+math);
	        System.out.println("���� :"+eng);
	        System.out.println("���� :"+tot);
	        System.out.println("��� :"+avg);
	        
	        //��� ������ 60�� �̻��̸� �հ� �ƴϸ� ���հ�

	    
	        
	        if ( avg >=60) {
	        	System.out.println("�հ��Դϴ�");
	        }else {
	        	System.out.println("���հ��Դϴ�");
	        }
		}
}
