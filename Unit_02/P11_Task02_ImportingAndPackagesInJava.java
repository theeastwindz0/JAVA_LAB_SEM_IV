package Unit_02;
import static java.lang.System.*;
import static java.lang.Math.*;
import Unit_01.SampleClass;

public class P11_Task02_ImportingAndPackagesInJava {

	public static void main(String[] args) {
		out.println("Welcome to package");
		out.println(sqrt(4));
		System.out.println(pow(2,2));
		System.out.println(abs(6.3));
		SampleClass obj=new SampleClass();
		System.out.println(obj.a);
	}

}