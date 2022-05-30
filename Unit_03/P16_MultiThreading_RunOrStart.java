package Unit_03;

public class P16_MultiThreading_RunOrStart {

	public static void main(String[] args) {
		Thread Temp=new Thread(new Temp2(),"t1");
		Temp.start();
	}

}
class Temp2 extends Thread{
	public void run() {
		System.out.println("Hello I am thread!!");
	}
}