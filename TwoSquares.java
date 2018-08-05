public class  TwoSquares {
	public static void main(String[] args) {
		drawBox();
		drawBox();
	}	

	public static void drawBox() {
		drawLine1();
		drawLine2();
		drawLine1();
	}

	public static void drawLine1() {
		System.out.print("+--------+\n");		
	}

	public static void drawLine2() {
		System.out.print("|        |\n");
		System.out.print("|        |\n");
		System.out.print("|        |\n");		
	}

}