package xyz;

public class A {

	
	public A(){
		System.out.println("I am A . ");
	}
	public A(int hours){
		System.out.println("I am A with a number " + hours);
	}
	public A(String name){
		System.out.println("Name of this is  " + name);
	}
	public void sleep(){
		System.out.println("I need sleep");
	}
	public void sleep(int hours){
		System.out.println("I want to sleep " + hours + " hours");
	}
	public static void main(String[] args) {
		
		A a = new A("Bharath");
		a.sleep(4);
	}
}
