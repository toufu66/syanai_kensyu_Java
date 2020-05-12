package sales;

import java.util.ArrayList;


public class SalesMain {
    // 全ての顧客の名前、購入金額、送料を表示する 
    //全ての顧客の購入金額＋送料の合計を表示する 
    public static void main(String[] a){
        ArrayList<Sales> s = new ArrayList<Sales>();
        s.add(new Sales("田中", 1500));
        s.add(new Sales("山田", 3000));
        s.add(new MemberSales("鈴木", 1000));
        
        int sum =0;
        for (Sales i:s){
            System.out.printf("%s \n",i.toString());
            sum+=i.getTotal();
        }
        System.out.printf("合計 %d 円",sum);

    }
}