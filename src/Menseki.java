import static java.lang.System.*;
public class Menseki {

	public static void main(String[] args) {
		int r=10;
		out.print("1問目  ");
		out.println(circleArea(r));
		out.print("2問目  ");
		for (int i=1;i <=5; i++) {
			out.println(circleArea(i));
		}

		out.print("2問目  ");
		int[] rs= {3,8,20};
		for(int i:rs) {
			out.println(circleArea(i));

		}
	}

	public static double circleArea(int r) {
		return r*r*Math.PI;
	}










}
