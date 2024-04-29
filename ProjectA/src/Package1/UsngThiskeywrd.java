package Package1;

public class UsngThiskeywrd {

	public void m1() {
		System.out.println("Default parameterized method");
	}
	public void m2(int a) {
		System.out.println("one parameterized method");
	}
	public void m3(int a, int b) {
		System.out.println("two parameterized method");
	}
	public void m4(int a, int b, int c) {
		System.out.println("three parameterized method");
		this.m1();
		this.m2(1);
		this.m3(1, 2);
		this.m5(1, 2, 3, 4);
		}
	public void m5(int a, int b, int c,int d) {
		System.out.println("four parameterized method");

}
	public static void main(String[] args) {
		UsngThiskeywrd ths=new UsngThiskeywrd ();
		ths.m4(1, 2, 3);
	}
}