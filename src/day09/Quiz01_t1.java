package day09;

public class Quiz01_t1 {
	public void bigNum(int a, int b) {
		if(a>b) {
			System.out.println(a+"�� ��ũ��.");
		}else if(a<b) {
			System.out.println(b+"�� ��ũ��.");
		}else if(a==b) {
			System.out.println("�μ��� ���� ");
		}else {
			System.out.println(a+"�� ���� �ʾƴ� ���Դϴ�.");
		}
	}
	public void liNum(int a) {
		if(a%2==0) {
			System.out.println("¦�� �Դϴ�. ");
		}else if(a%2==1) {
			System.out.println("Ȧ�� �Դϴ�.");
		}else {
			System.out.println("������ �ƴմϴ�.");
		}
	}
	public int threeNum(int a) {
		if(a%3!=0) {
			return 1;
		}else {
			return a;
		}
	}
	
	public void dicNum(int a) {
		int i,n=0;
		for(i=2;i<a;i++) {
			if(a%i==0) {				
				n++;
			}
		}
		if(a==1 || a==2) {
			System.out.println(a+" �Դϴ�.");
		}
		else if (a>2){
			if(n==0) {
				System.out.println(a+"�� �Ҽ��� �½��ϴ�.");
			}else {
				System.out.println(a+"�� �Ҽ��� �ƴմϴ�.");
			}
		}else {
			System.out.println("������ �ƴմϴ�.");
		}	
	}
	public void abVal(int a) {
		if(a<0) {
			a=a*(-1);
		}
		System.out.println("���밪��: "+a);
	}
	public int ary(int a) {
		int b=0,i;
		for(i=a;i>0;i/=10) {
			b=b*10+i%10;
		}
		return b;
	}
	
}
