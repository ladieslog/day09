package day09;

import java.util.Scanner;

public class Quiz01_t2 {
	public static void main(String[] args) {
		Quiz01_t1 quiz =new Quiz01_t1();
		Scanner pulls = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("ù��° ������ �Է�: ");
		a=pulls.nextInt();
		System.out.print("�ι��� ������ �Է�: ");
		b=pulls.nextInt();
		quiz.bigNum(a, b);

		System.out.print("¦Ȧ���� ������ �Է�: ");
		a=pulls.nextInt();
		quiz.liNum(a);
		System.out.print("3������� ������ �Է�: ");
		a=pulls.nextInt();
		c=quiz.threeNum(a);
		if(c!=1) {
			System.out.println(c+"�� 3����̴�.");
		}else {
			System.out.println("����� �ƴϴ�.");
		}
		System.out.print("�Ҽ����� ������ �Է�: ");
		a=pulls.nextInt();
		quiz.dicNum(a);
		System.out.print("���밪���� ������ �Է�: ");
		c=pulls.nextInt();
		quiz.abVal(c);
		System.out.print("�Ųٷα��ϱ� ������ �Է�: ");
		c=pulls.nextInt();
		b=quiz.ary(c);
		System.out.println(b);
	}
}












