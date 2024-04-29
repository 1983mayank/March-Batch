package Package1;

public class ParentConstructor {

	public ParentConstructor() {
		this(1,2,3);
		
		System.out.println("Parent default constructor");
	}
public ParentConstructor(int a) {
	this(1,2);
		
		System.out.println("Parent one parameterized constructor");
	}
public ParentConstructor(int a,int b) {
	this();
	
	System.out.println("Parent two parameterized constructor");
}
public ParentConstructor(int a,int b,int c) {
	
	System.out.println("Parent three parameterized constructor");
}
}
