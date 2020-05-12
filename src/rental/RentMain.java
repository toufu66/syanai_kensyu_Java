package rental;
//import java.util.ArrayList;

public class RentMain {
    public static void main(String[] a){
        Rental r = new Rental();
        //Item i0 = new Book("真夏の夜の淫夢1",11);
        //Item i1 = new Book("真夏の夜の淫夢1",11);
        r.add(new Book("真夏の夜の淫夢1",11));
        r.add(new Book("真夏の夜の淫夢2",45));
        r.add(new Book("真夏の夜の淫夢3",14));
        r.add(new Cd("ひでのうた",1));
        r.add(new Cd("野獣の歌",2));
        r.add(new Cd("ダイナモ感覚",4));

        int sum = r.sum();
        r.show();
        System.out.println("合計"+ sum+ "円");
    }
}