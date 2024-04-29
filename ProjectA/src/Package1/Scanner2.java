package Package1;

import java.util.Scanner;

public class Scanner2 {
//	(((((x1-x2)+x3)*x4)-x5)/x6)
	int sub(int a, int b) {
		return a-b;
	}
	int sum(int c, int d) {
		return c+d;
	}
	int multi(int g , int h) {
		return g*h;
	}
	float div(float x, float y) {
		return x/y;
	}
	
	public static void main(String[] args) {
//		(((((x1-x2)+x3)*x4)-x5)/x6)
		Scanner2 ob=new Scanner2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x1 : ");
		int x1=sc.nextInt();
	
		System.out.println("Enter the value of x2 : ");
		int x2=sc.nextInt();
		int subResult1=ob.sub(x1, x2);
		

		System.out.println("Enter the value of x3 : ");
		int x3=sc.nextInt();
		int sumResult=ob.sum(subResult1, x3);
		
		System.out.println("Enter the value of x4 : ");
		int x4=sc.nextInt();
		int multiResult=ob.multi(sumResult, x4);
		
		System.out.println("Enter the value of x5 : "); 
		int x5=sc.nextInt();
		int subResult2=ob.sub(multiResult, x5);
		
		System.out.println("Enter the value of x6 : ");
		int x6=sc.nextInt();
		float divResult=ob.div(subResult2, x6);
	
		
		System.out.println("The final result after division " + divResult);
		
	}
	}
//Scanner1 obj=new Scanner1();
//Scanner ob=new Scanner(System.in);
//
//System.out.println("Enter the value of x1 :");
//int x1=ob.nextInt();
//
//System.out.println("Enter the value of x2 :");
//int x2=ob.nextInt();
//int multiResult=obj.multi(x1, x2);
////(((((x1*x2)+x3)-x4)+x5)/x6) 
//
//System.out.println("Enter the value of x3 :");
//int x3=ob.nextInt();
//int sumResult1=obj.sum(multiResult, x3);
//
//System.out.println("Enter the value of x4 :");
//int x4=ob.nextInt();
//int subResult=obj.sub(sumResult1,x4);
//
//System.out.println("Enter the value of x5 :");
//int x5=ob.nextInt();
//int subResult2=obj.sum(subResult, x5);
//
//System.out.println("Enter the value of x6 :");
//int x6=ob.nextInt();
//float divResult=obj.div(subResult2, x6);
//System.out.println("The final result " + divResult);
