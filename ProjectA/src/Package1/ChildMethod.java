package Package1;

public class ChildMethod extends ParentMethod

{
public void cm1() {
	super.m2(1);
	this.cm2(1);
	System.out.println("child default method");
}
public void cm2(int a) {
super.m4(1, 2, 3);
	System.out.println("child one parameterized method");
}
public void cm3(int a, int b) {
//super.m4(1, 2, 3);

	System.out.println("child two parameterized method");
}
public void cm4(int a,int b, int c) {
	super.m3(1, 2);
	super.m1();
	this.cm1();
	this.cm3(1, 2);
	System.out.println("child three parameterized method");
}
public static void main(String[] args) {
	System.out.println("Output using this & super keyword ");
	System.out.println("--------------------------------- ");
	ChildMethod ob=new ChildMethod();
	ob.cm4(1, 2, 3);

}
}
