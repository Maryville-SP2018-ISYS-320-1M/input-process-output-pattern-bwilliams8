import java.util.Scanner;

/*
	ISYS 320
	Name(s): Brian Williams
	Date: 4/1/2018
*/

public class P4_ScalableBox {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Input box width: ");
		int width = console.nextInt();
		System.out.print("Input box height: ");
		int height = console.nextInt();
		System.out.println();
		
		drawBoxCap(width, height);
		drawBoxInsides(width, height);
		drawBoxCap(width, height);
		
		console.close();
	}
	
	public static void drawBoxCap(int width, int height) {
		System.out.print("+");
		
		for( int capDashIndex = 1; capDashIndex <= width - 2; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides(int width, int height) {
		for( int insideRowIndex = 1; insideRowIndex <= height - 2; insideRowIndex++ ) {
			drawBoxInsideLine(width, height);
		}
	}
	
	public static void drawBoxInsideLine(int width, int height) {
		System.out.print("|");
		
		for( int insideRowIndex = 1; insideRowIndex <= width - 2; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
