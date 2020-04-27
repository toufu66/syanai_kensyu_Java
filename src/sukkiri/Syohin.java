package sukkiri;

public class Syohin {
    String name;
    int price;  // Syohin s = new Syohin(); s.price = 100; s.show(); 
    int tax;
    void show(){

        System.out.printf("%s : %d 円",this.name,this.price);
    }
    void showTax(){
        int naizei = (int) (this.price * this.tax * 0.01); 
        System.out.printf("( + 税 : %d 円)",naizei);
    }
}