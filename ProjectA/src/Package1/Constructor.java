package Package1;

public class Constructor {

	public Constructor() {
		this(1, 2, 3);
		System.out.println("Default constructor");
	}
	public Constructor(int a) {
		this(1, 2, 3, 4);
		System.out.println("one parameterized constructor");
	}
	public Constructor(int a, int b) {
		this(1);
		System.out.println("two parameterized constructor");
	}
	
	public Constructor(int a, int b, int c) {
		System.out.println("three parameterized constructor");
	}
	public Constructor(int a, int b, int c, int d) {
		this();
		System.out.println("four parameterized constructor");
	}
	public static void main(String[] args) {
		 Constructor ob=new  Constructor(1,2);
		
		
	}
}
