package Package1;

import java.util.Scanner;

//(((((x1*x2)+x3)-x4)+x5)/x6)       
public class Scanner1 {

	int multi(int a,int b) {
		return a*b;
	}
	int sum(int c, int d) {
		return c+d;
	}
	int sub(int g, int h) {
		return g-h;
	}
	float div(float m, float n) {
		return m/n;
	}
	public static void main(String[] args) {
		
	Scanner1 obj=new Scanner1();
	Scanner ob=new Scanner(System.in);
	
	System.out.println("Enter the value of x1 :");
	int x1=ob.nextInt();
	
	System.out.println("Enter the value of x2 :");
	int x2=ob.nextInt();
	int multiResult=obj.multi(x1, x2);
//	(((((x1*x2)+x3)-x4)+x5)/x6) 
	
	System.out.println("Enter the value of x3 :");
	int x3=ob.nextInt();
	int sumResult1=obj.sum(multiResult, x3);
	
	System.out.println("Enter the value of x4 :");
	int x4=ob.nextInt();
	int subResult=obj.sub(sumResult1,x4);
	
	System.out.println("Enter the value of x5 :");
	int x5=ob.nextInt();
	int subResult2=obj.sum(subResult, x5);
	
	System.out.println("Enter the value of x6 :");
	int x6=ob.nextInt();
	float divResult=obj.div(subResult2, x6);
	System.out.println("The final result " + divResult);
	
	
	
	}
}

