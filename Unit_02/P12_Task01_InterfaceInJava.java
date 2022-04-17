package Unit_02;
public class P12_Task01_InterfaceInJava implements Animal{

	public static void main(String[] args) {
		C1 obj=new C1();
		obj.funcA();
		obj.funcB();
	}
	public void animalSound() {
		// TODO Auto-generated method stub
	}
	public void run() {
		// TODO Auto-generated method stub		
	}
}

interface Animal{
	public void animalSound();
	public void run();
}
interface Human{
	public void humanSound();
	public void run1();
}
class Species implements Animal,Human{

	public void animalSound() {
		// TODO Auto-generated method stub	
	}
	public void run() {
		// TODO Auto-generated method stub	
	}
	public void humanSound() {
		// TODO Auto-generated method stub		
	}
	public void run1() {
		// TODO Auto-generated method stub		
	}
}

interface A1{
	void funcA();
}

interface B1 extends A1{
	void funcB();
}
class C1 implements B1{
	public void funcA() {
		System.out.println("This is funcA from A1");
	}

	@Override
	public void funcB() {
		// TODO Auto-generated method stub
		
	}
}


