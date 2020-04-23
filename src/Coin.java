import static java.lang.System.*;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] coins = {500,100,50,10,5,1};
		int sum = 0;
		for (int i:coins) {
			out.printf("%3d円玉は何枚？..... : ",i);
			sum += i*scan.nextInt();
		}
		out.printf("合計%d円",sum);
		scan.close();
	}

}
