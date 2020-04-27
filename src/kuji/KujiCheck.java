package kuji;

public class KujiCheck {
    
    void check(Kuji k){
        if(k.num == 123456){
            k.kekka = "1等";
            k.money = 1000000000;
        }else if(k.num %100 ==12){
            k.kekka = "2等";
            k.money = 100;
        }else {
            k.kekka = "ハズレ";
            k.money = 0;
        }


    }
}