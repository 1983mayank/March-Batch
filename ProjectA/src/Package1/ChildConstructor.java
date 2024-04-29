package Package1;

public class ChildConstructor extends ParentConstructor

{
	public ChildConstructor() {
		this(1,2);

		System.out.println("Child default constructor");
	}
	public ChildConstructor(int a) {
		this();

		System.out.println("Child one parameterized constructor");
	}
	public ChildConstructor(int a, int b) {
		super(1);

		System.out.println("Child two parameterized constructor");
	}
	public ChildConstructor(int a, int b,int c) {
		this(1);

		System.out.println("Child three parameterized constructor");
	}
	public static void main(String[] args) {
		System.out.println("Output using this & super keyword " + "(Explicit call)");
		System.out.println("---------------------------------");
		
		ChildConstructor cons=new ChildConstructor(1,2,3);
	}
}

