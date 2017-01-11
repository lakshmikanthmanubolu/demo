package covalent;

public class MethodsEx {

	
	
	/*public static void add1(){
		int a = 10;
		int b = 20;
		int c = a +b;
		System.out.println(c);
	}
	*/
	
	public static void add2(int a ){
		int c = a + a;
		System.out.println(c);
	}
	
	
	public static int add3(int a ){
		int	c  = a + a;
		return c;
	}
	
	public static int multiply(int x){
		int z = x * 10;
		return z;
	}
	//int g = z;
	public static void main(String[] args) {
		int m = 30;
		int k = add3(m);
		System.out.println(k);
		int z = multiply(k);
		System.out.println(z);
	}
}
