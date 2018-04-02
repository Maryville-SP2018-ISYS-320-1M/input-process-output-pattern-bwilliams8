import java.util.Scanner;

/*
	ISYS 320
	Name(s):Brian Williams
	Date: 4/1/2018
*/

public class P2_Doubler {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What is your number? ");
		double number = console.nextDouble();
		double numberdoubled = (number * 2);
		System.out.print("That number doubled is " + numberdoubled + ".");
		
		
		console.close();
	}

}
