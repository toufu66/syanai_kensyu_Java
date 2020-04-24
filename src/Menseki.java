import static java.lang.System.*;
public class Menseki {
	public static void main(final String[] args) {
		final int r = 10;
		out.print("1問目  ");
		out.println(circleArea(r));
		out.print("2問目  ");
		for (int i = 1; i <= 5; i++) {
			out.println(circleArea(i));
		}
		out.print("3問目  ");
		final int[] rs = { 3, 8, 20 };
		for (final int i : rs) {
			out.println(circleArea(i));
		}
	}

	public static double circleArea(final int r) {
		return r*r*Math.PI;
	}	
}
