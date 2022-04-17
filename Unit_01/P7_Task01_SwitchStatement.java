// package Practical_Lab_7;
import java.util.Scanner;
import java.util.Calendar;

/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

public class P7_Task01_SwitchStatement {

	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
		// Write Logic here!
		int choice;
		System.out.println("Enter the choice: ");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		// switch(choice) {
			// case 1:
			// 	System.out.println("Current year is 2022");
			// 	break;
			// case 2:
			// 	System.out.println("Current month is April");
			// 	break;
			// case 3:
			// 	System.out.println("Current day is 04");
			// 	break;
			// default:
			// 	System.out.println("Not applicable");
			// 	break;
			// }
	
	
			//date year month object using calendar class
		switch(choice) {
		case 1:
			System.out.println("Current year is: " + Calendar.getInstance().get(Calendar.YEAR));
			break;
		case 2:
			System.out.println("Current month is: " + Calendar.getInstance().get(Calendar.MONTH));
			break;
		case 3:
			System.out.println("Current day is: " + Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
			break;
		default:
			System.out.println("Not applicable");
			break;
		}
		
	}
}