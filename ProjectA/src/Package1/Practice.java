package Package1;

public class Practice {

	int rollNo;
	int age;
	public void display1() {
		System.out.println("Welcome to all of you");
	}
public void display2() {
	System.out.println("Automation is very easy");
}
	
public static void main(String[] args) {
	Practice ob=new Practice();
	ob.rollNo= 2;
	ob.age=38;
	System.out.println("My rollNo is " + ob.rollNo);
	System.out.println("My age is " + ob.age);
	ob.display1();
	ob.display2();
}
}

