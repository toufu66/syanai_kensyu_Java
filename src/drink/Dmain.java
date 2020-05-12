package drink;

import java.util.ArrayList;

public class Dmain {

    public static void main(String[] a){
        ArrayList<Drink> ds = new ArrayList<Drink>();
        ds.add(new Drink());
        ds.add(new Drink("サイダー",350));
        ds.add(new Drink("コーヒー",220));
        int am_s = 0;
        for (Drink i:ds){
            i.show();
            am_s+=i.amount;
        }
        System.out.println("合計"+am_s + "ml");
    }

}