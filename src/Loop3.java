import static java.lang.System.*;
import java.util.Scanner;

public class Loop3 {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	for (int i =0;i<5;i++) {
		out.print("こんにちは ");
	}
	out.print("\n");

	for (int i =0;i<5;i++) {

		out.printf("%d ",i+1);
	}

	out.print("\n");
	out.print("数字を入力してください");
	int mx = scan.nextInt();

	for (int i =0;i<mx;i++) {

		out.printf("%d ",i+1);
	}
	out.print("\n");
	for (int i =1;i<=10;i++) {
		if(i%2==0) {
			out.printf("%d ",i);
		}
	}

	out.print("\n");

	for (int i = 5; i > 0;i--) {

		out.printf("%d ",i);

	}
	scan.close();
}
}
