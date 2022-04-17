public class P9_Task01_AbstractAndFinalClassInJava {

	public static void main(String[] args) {
		Bike obj=new Honda4();
		obj.run();
		obj.display();
		// can not be instantiated
		// BIke obj2 =new Bike();
	}

}

abstract class Bike{
	int a;
	Bike(){
		System.out.println("Inside Bike Constructor: "+a+"\n");
	}
	abstract void run(); // abstract method
	void display() {
		System.out.println("This is display method!");
	}
}

class Honda4 extends Bike{

	void run() {
		System.out.println("run called");
	}
	
}


final class Super{
	public int data=30;
	void display() {
		System.out.println(data);
	}
}