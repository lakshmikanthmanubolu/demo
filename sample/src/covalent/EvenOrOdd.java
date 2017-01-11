package covalent;

public class EvenOrOdd {

	public static void main(String[] args) {

		int number = 1452;
		int remainder = number % 2;
		/*if (remainder == 0) {
			System.out.println("Even");
		} else if (remainder == 1) {
			System.out.println("Odd");
		}*/
		
		/*for (int i = 0; i <=number; i=i+2) {
			System.out.println(i);
		}*/
		
		// THis is single line comment
		
		for (int i = 0; i < number; i++) {
			 remainder = i % 2;
			if (remainder == 1) {
				System.out.println(i);
			}
		}
	}

}
