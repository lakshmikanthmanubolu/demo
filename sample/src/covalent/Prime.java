package covalent;

public class Prime {

	public static void main(String[] args) {

		int number = 99;
		boolean flag = true;
		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				flag = false;
				System.out.println("THis is not a primenumber");
				break;
			}

		}
		if(flag==true){
			System.out.println("This is prime");
		}
		
	}

}
