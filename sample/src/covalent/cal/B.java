package covalent.cal;


public class B {

	
	public B(String name){
		System.out.println("Name of the parameter is " + name);
	}
	
	public void sleep(){
		System.out.println("I  sleeping in Class ");
	}
	public static void main(String[] args) {
		B bb = new B("bharath");
		bb.sleep();
	}
}
