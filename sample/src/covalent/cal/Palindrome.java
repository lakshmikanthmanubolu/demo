package covalent.cal;

import java.util.Scanner;

public class Palindrome {

	
	
	public static void main(String[] args) {
		
		
		//String str2 = args[0];
	/*	Scanner sc = new Scanner(System.in);
		String str2 = sc.nextLine();
		int t  = sc.nextInt();
		System.out.println(t);
		System.out.println(str2);
		*/
		String str2  = "dsd";
		int size = str2.length();
		System.out.println(size);
		String rev = "";
		for (int i = size-1; i >= 0; i--) {
			char ch = str2.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		
		
		boolean flag = rev.equals(str2);
		
		if(flag == true ){
			 System.out.println(str2 + " is a palinidrome");
		 }else{
			 System.out.println("Its not");
		 }
	}
	
	
	/*public void test1(){
		StringBuilder st = new StringBuilder("madam");
		StringBuilder orig = new StringBuilder("madam");
		System.out.println(st);
		StringBuilder rev = st.reverse();
		  System.out.println(rev);
		  System.out.println(st);
		 boolean flag = orig.equals(rev);
		 if(flag == true ){
			 System.out.println(st + " is a palinidrome");
		 }else{
			 System.out.println("Its not");
		 }
	}*/
}
