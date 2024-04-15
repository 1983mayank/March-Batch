package Package1;
//(((((10+2)+2)-2)*2)/2)
public class ArithmeticShortCode {

	public int sum (int a, int b) {
		return a+b;
	}
	public int sub (int c, int d) {
		return c-d;
	
	}
	public int multi (int g, int h) {
		return g*h;
	}
	public int divide(int x, int y) {
	return x/y;
	}
	public static void main(String[] args) {
		ArithmeticShortCode obj=new ArithmeticShortCode();
		int sumResult=obj.sum(10, 2);                                                                                                              
		int sumResult1=obj.sum(sumResult, 2);
		int subResult=obj.sub(sumResult1, 2);
		int multiResult=obj.multi(subResult, 2);
		int divideResult=obj.divide(multiResult, 2);
		System.out.println("Final result is " + divideResult);
	}
}


