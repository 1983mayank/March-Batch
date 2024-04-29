package Package1;

public class ConstructorThis {
	public ConstructorThis() {
		this(1,2);
	System.out.println("Default constructor");	
		
	}
public ConstructorThis(int a) {
		this(1,2);
		System.out.println("one parameterized constructor");	
			
		}
public ConstructorThis(int a,int b) {
		
		System.out.println("two parameterized constructor");	
			
		}
public ConstructorThis(int a,int b,int c) {
this(1,2,3,4);

	System.out.println("three parameterized constructor");		
	}
public ConstructorThis(int a,int b,int c,int d) {
	
	System.out.println("four parameterized constructor");		
	}
public static void main(String[] args) {
	ConstructorThis ob=new ConstructorThis(1,2,3);
}
}
