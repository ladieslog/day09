package day09;

import java.util.Scanner;

public class Ex02_2 {
	public static void main(String[] args) {
		Ex02_1 ex =new Ex02_1();
		ex.test();
		ex.sumFunc();
		System.out.println();
		int n1=100,n2=200;
		ex.lumFunc(10,20);
		ex.lumFunc(n1,n2);
		
		System.out.println();
		ex.bix("아이아",40);
		int n= ex.numFunc(10, 40);
		System.out.println(n);
		
		ex.tell(2);
		String st=ex.test02();
		System.out.println( st);
		ex.display();
		
	}
	public void nim() {
		Scanner in =new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=in.nextInt();
		System.out.println(num);
	}
	
	
}
