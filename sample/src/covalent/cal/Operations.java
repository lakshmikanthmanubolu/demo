package covalent.cal;
import covalent.abc.Add;

public class Operations {

	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		int a = 20;
		int b = 30;
		int c = calc.add(a,b);
		int d = calc.multipy(a, c);
		System.out.println(d);
		
		Add ad = new Add();
	}
}
