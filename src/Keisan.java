import static java.lang.System.*;
import java.util.Scanner;
public class Keisan {
	public static void main(String[] args) {
		out.println("数字を入力してください:");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		//out.println("２つ目の数字を入力してください:");
		int num2 = scan.nextInt();
		out.printf("%d and %d",num1,num2);
		//out.print(scan.hasNext());
		scan.close();
	}
}
