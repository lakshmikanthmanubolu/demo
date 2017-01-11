package covalent;

import sun.applet.Main;

public class Swap {

	public static void main(String[] args) {
		
		int a =20;
		int b = 4;
		int temp = 0;
		
		temp = a;
		a = b;
		b= temp;
		System.out.println("a=" +  a);
		System.out.println(b);
		/*a = a+ b;  //a=50
		b = a - b; //b=20
		a = a -b; // a = 30;
		System.out.println("a=" +  a);
		System.out.println(b);*/
		
		int k = a / b * 5; 
		System.out.println(k);//109
		//10
	}
}
