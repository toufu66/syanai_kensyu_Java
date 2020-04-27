package kuji;
public class KujiCheck {
    int money;
    void check(Kuji k){
        if(k.num == 123456){
            k.kekka = "1等";
            this.money += 1000000000;
        }else if(k.num %100 ==12){
            k.kekka = "2等";
            this.money += 100;
        }else {
            k.kekka = "ハズレ";
            this.money += 0;
        }


    }
}