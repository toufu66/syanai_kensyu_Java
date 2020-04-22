import static java.lang.System.*;

import java.util.Scanner;

public class IfSample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if (age >= 20) {
			out.print("カクテルを飲もう");
		} else {
			out.print("モクテルを飲もう");
		}
		scan.close();
	}
}
