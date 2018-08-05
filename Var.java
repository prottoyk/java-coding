public class Var {
	public static void main(String[] args) {
		int inch = 12;
		int foot = 3;
		int yard = inch * foot;
		int mile = 1760 * yard;
		int x = 3;
		System.out.println("foot = " + inch + " inches");
		System.out.println("There are " + (mile * x) + " inches in " + x + " miles.");
	}
}