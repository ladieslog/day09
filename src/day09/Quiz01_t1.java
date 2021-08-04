package day09;

public class Quiz01_t1 {
	public void bigNum(int a, int b) {
		if(a>b) {
			System.out.println(a+"가 더크다.");
		}else if(a<b) {
			System.out.println(b+"가 더크다.");
		}else if(a==b) {
			System.out.println("두수가 같음 ");
		}else {
			System.out.println(a+"는 존재 않아는 수입니다.");
		}
	}
	public void liNum(int a) {
		if(a%2==0) {
			System.out.println("짝수 입니다. ");
		}else if(a%2==1) {
			System.out.println("홀수 입니다.");
		}else {
			System.out.println("정수가 아닙니다.");
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
			System.out.println(a+" 입니다.");
		}
		else if (a>2){
			if(n==0) {
				System.out.println(a+"는 소수가 맞습니다.");
			}else {
				System.out.println(a+"는 소수가 아닙니다.");
			}
		}else {
			System.out.println("정수가 아닙니다.");
		}	
	}
	public void abVal(int a) {
		if(a<0) {
			a=a*(-1);
		}
		System.out.println("절대값은: "+a);
	}
	public int ary(int a) {
		int b=0,i;
		for(i=a;i>0;i/=10) {
			b=b*10+i%10;
		}
		return b;
	}
	
}
