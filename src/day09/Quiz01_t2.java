package day09;

import java.util.Scanner;

public class Quiz01_t2 {
	public static void main(String[] args) {
		Quiz01_t1 quiz =new Quiz01_t1();
		Scanner pulls = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("첫번째 정수를 입력: ");
		a=pulls.nextInt();
		System.out.print("두번재 정수를 입력: ");
		b=pulls.nextInt();
		quiz.bigNum(a, b);

		System.out.print("짝홀구별 정수를 입력: ");
		a=pulls.nextInt();
		quiz.liNum(a);
		System.out.print("3배수구별 정수를 입력: ");
		a=pulls.nextInt();
		c=quiz.threeNum(a);
		if(c!=1) {
			System.out.println(c+"는 3배수이다.");
		}else {
			System.out.println("배수가 아니다.");
		}
		System.out.print("소수구별 정수를 입력: ");
		a=pulls.nextInt();
		quiz.dicNum(a);
		System.out.print("절대값구별 정수를 입력: ");
		c=pulls.nextInt();
		quiz.abVal(c);
		System.out.print("거꾸로구하기 정수를 입력: ");
		c=pulls.nextInt();
		b=quiz.ary(c);
		System.out.println(b);
	}
}












