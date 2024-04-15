package Package1;
//(((((10+2)+2)-2)*2)/2)
public class Arithmetic1 {
public int sum (int a, int b) {
	int c;
	c=a+b;
	System.out.println("Result of sum is " + c);
	return c;
	
	
}
public int sub (int g, int h) {
	int i;
	i=g-h;
	System.out.println("Result of sub is " + i);
	return i;
}
public int multi (int r, int s) {
	int t;
	t=r*s;
	System.out.println("Result of sum is " + t);
	return t;
}
public void divide (int x,int y) {
int z;
z=x/y;
System.out.println("Result of divide is " + z);



}
public static void main(String[] args) {
	Arithmetic1 obj=new Arithmetic1();
	int sumResult = obj.sum(10, 2);
	int sumResult2 = obj.sum(sumResult, 2);
	int subResult = obj.sub(sumResult2, 2);
	int multiResult = obj.multi(subResult, 2);
	obj.divide(multiResult, 2);
	
}
}
