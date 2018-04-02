import java.util.Scanner;

/*
	ISYS 320
	Name(s):Brian Williams
	Date: 4/1/2018
*/

/*
 Your expected results after the input is provided:
 
 1.34.5
 2.6.0
 3.error
 4.error
 
 5.error
 6.error
 7.error
 8.645.0
  
 */

public class P1_TestInputExpressions {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); 
		System.out.print("How much money do you have? "); 
		double money = console.nextDouble(); 
		System.out.print(money);
		
		console.close();
	}

}
