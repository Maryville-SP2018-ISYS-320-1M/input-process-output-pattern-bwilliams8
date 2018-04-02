import java.util.Scanner;

/*
	ISYS 320
	Name(s): Brian Williams
	Date: 4/1/2018
*/

public class P3_EchoChamber {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What is your phrase? ");
		String phrase = console.nextLine();
		System.out.print("How many times should I repeat it? ");
		int repeat = console.nextInt();
		for(int i = 0; i<repeat;i++) {
			System.out.println(phrase);
		}
		
		console.close();

	}

}
