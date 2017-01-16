package school;

import com.slokam.calculator.impl.CalculatorImpl;

public class Operations {

	public static void main(String[] args) {

		Student st = new Student();

		int ma = st.getMarks("Bharath");
		System.out.println("Marks of Student is " + ma);

		CalculatorImpl impl = new CalculatorImpl();
		int results = impl.add(30, 30);
		System.out.println(results);
	}

}
