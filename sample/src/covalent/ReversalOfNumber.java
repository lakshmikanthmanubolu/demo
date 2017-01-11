package covalent;

public class ReversalOfNumber {

	
	public static void main(String[] args) {
		
		
		int orig = 4321324;
		int rev = 0;
		int rem = 0;
		while(orig!=0){
			int x = 30;
			rem = orig %10;
			orig = orig/10;
			rev  = rev *10 + rem;
		}
		
	
		System.out.println(rev);
	}
}
