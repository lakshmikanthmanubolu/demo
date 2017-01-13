package statO;


public class Ops {

	
	public void test1(){
		
		B b = new B();
		b.sleep();
		b.play();
		b.wakeUp();
		
		
		A aa =  new B();
		aa.sleep();
		aa.wakeUp();
		
		
	}
	
	public static void main(String[] args) {
		Ops op = new Ops();
		op.test1();
	}
}


