import static java.lang.System.*;

import java.util.Random;
import java.util.Scanner;

public class Kuku {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int cnt=0;
		for (int i=1;i<=10;i++) {
			int num1 = rand.nextInt(9)+1;
			int num2 = rand.nextInt(9)+1;
			out.printf("第%d問 %d x %d =", i,num1,num2);
			int ans = num1 * num2;
			int usrAns = scan.nextInt();

if (i != 10) {
			if ((ans == usrAns)) {
				cnt++;
				out.printf("正解です。あと%d問\n",10-i);
			}else  {
				out.printf("残念、間違いです正解は%d です。あと%d問\n",ans,10-i);
			}
}else {

	if ((ans == usrAns)) {
		out.printf("正解です。これで終了です\n\n",10-i);
		cnt++;
	}else  {
		out.printf("残念、間違いです。これで終了です\n\n",ans,10-i);
	}

}
		}
		out.println("--------------------");
		out.printf(" 10問中%d 問 正解です \n", cnt);
		out.println("--------------------");
		scan.close();
	}
}
