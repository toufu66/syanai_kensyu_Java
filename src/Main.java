import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		int month = 4;
		int day = 22;
		int num = 10;
		int kokugo = 70;
		int sansu = 75;
		out.printf("今日は%d月%d日です\n",month,day);
		out.printf("円周率は%.2fです\n",Math.PI);
		out.print("C:\\に\"フォルダ\"を作成\n");
		out.printf("%dを3で割ったあまりは%dです\n", num,num%3);
		out.printf("平均点は%.2f です", (double)(kokugo+sansu)/2);
	}
}
