package kuji;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args){
        KujiCheck k = new KujiCheck();    

        Kuji kuji1= new Kuji();
        kuji1.num = 123456;
        k.check(kuji1);
        out.println(kuji1.kekka+k.money+"円");


        Kuji kuji2= new Kuji();
        kuji2.num = 101012;
        k.check(kuji2);
        out.println(kuji2.kekka+k.money+"円");


        Kuji kuji3= new Kuji();
        kuji3.num = 654321;
        k.check(kuji3);

        out.println(kuji3.kekka+k.money+"円");

        }
}