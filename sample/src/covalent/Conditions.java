package covalent;

public class Conditions {

	public static void main(String[] args) {

		int marks = 30;

		/*if (marks < 40) {
			
			if(marks<0){
				System.out.println("Not Valid");
			}else{
				System.out.println("Failed");
			}
			
		} else if(marks <100){
			System.out.println("Pass");
		}else {
			System.out.println("Not Valid");
		}

		*/
		if(marks <0 || marks >100){
			System.out.println("Not Valid");
		}else if(marks<40){
			System.out.println("Failed");
		}else{
			System.out.println("PASS");
		}
		
	}
}
