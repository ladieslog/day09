package day09;

import java.util.Scanner;

public class Ex02_1 {

	public void test() {
		System.out.println("�ȳ��ϼ��� ");
	}
	
	public void sumFunc() {
		Scanner input =new Scanner(System.in);
		int num,su,sum;
		System.out.print("ù���Է� ");
		num=input.nextInt();
		System.out.print("�μ��Է� ");
		su=input.nextInt();
		sum=num+su;
		System.out.println("�� �� : "+sum);
	}
	
	public void lumFunc(int n,int n2) {
		int sum=0;
		sum= n+n2;
		System.out.println("�� ��: "+sum);
	}
	
	public void bix(String s,int i) {
		System.out.println("��� : " +s +i);
		Ex02_2 el =new Ex02_2();
		el.nim();
	}
	public int numFunc(int n1,int n2) {
		int sum =n1+n2;
		return sum;
	}
	public void tell(int n) {
		if(n==1) {
			System.out.println("if");
			
		}else {
			System.out.println("else");
			return;
		}
		System.out.println("test");
	}
	
	public String test02() {
		return "�ȳ��ϼ���";
	}
	public void display() {
		Scanner input= new Scanner(System.in);
		int n1,n2;
		System.out.print("�μ� �Է� : ");
		n1=input.nextInt();
		n2=input.nextInt();
		int sum=tim(n1,n2);
		printSum(n1,n2,sum);
	}
	public int tim(int n1 , int n2) {return n1 *n2;}
	public void printSum(int n1,int n2, int s) {
		System.out.println(n1+ " x "+n2+" = "+s);
	}
	
}











