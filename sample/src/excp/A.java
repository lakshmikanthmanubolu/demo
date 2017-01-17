package excp;

import covalent.abc.Add;

public class A {

	public int s = 10;
	public static int m = 30;
	String st = new String();
	
	Add ad =new Add();
	
	
	public void test1(){
		System.out.println("I am test1");
	}
	public static void main(String[] args) {
		A a  = new A();
		System.out.println(a.s);
		System.out.println(a.m);
		a.s = a.s + 20;
		a.m = a.m+ 30;
		System.out.println(a.s);
		System.out.println(a.m);
		
		
		A aa  = new A();
		System.out.println(aa.s);
		System.out.println(aa.m);
		aa.s = aa.s + 20;
		aa.m = aa.m+ 30;
		System.out.println(aa.s);
		System.out.println(aa.m);
	}
}
