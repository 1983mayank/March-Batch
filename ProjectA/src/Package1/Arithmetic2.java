package Package1;
//((((10*2)+2)-2)*2)/2)
public class Arithmetic2 {

	public int multi (int a, int b) {
	int c = a*b;
	System.out.println("Result of multi is " + c);
		return c;
		
}
	public int sum(int g, int h) {
		int i=g+h;
		System.out.println("Result of sum is "+ i);
		
		return i;	
	}
	public int sub(int r, int s) {
		int t=r-s;
		System.out.println("Result of sub is "+ t);
		return t;
	}
	public void divide(int x, int y) {
		int z=x/y;
			System.out.println("Result of divide is "+ z);
		
	}
	public static void main(String[] args) {
		
		Arithmetic2 obj=new Arithmetic2();
		int multiResult=obj.multi(10, 2);
		int sumResult=obj.sum(multiResult,2);
		int subResult=obj.sub(sumResult, 2);
		int multiResult2=obj.multi(subResult, 2);
		obj.divide(multiResult2, 2);
		
		}
	}
