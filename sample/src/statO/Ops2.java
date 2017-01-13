package statO;

public class Ops2 {

	
	public static void main(String[] args) {
		
		
		String whatanimal = args[0];
		
		Animal d = null ;
		if(whatanimal.equals("dog")){
			d  = new Dog();
			
		}else if(whatanimal.equals("elephant")){
			d = new Elephant();
			
		}
		
		d.eat();
		d.sleep();
		
	}
	
	
	
	
	
	
	
	
	
	

	public void test(){

		Dog d = new Dog();
		d.eat();
		d.sleep();
		d.run();
		d.tail();
		
		Elephant el = new Elephant();
		el.eat();
		
		
		Animal ani = new Animal();
		ani.eat();
		ani.sleep();
		ani.run();
		
		
		Animal any = new Dog();
		any.eat();
		
	}
	
}
