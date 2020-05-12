package sukkiri;

public class Syohin {
    String name;
    int price;   
    int tax;
    public Syohin(){
        this("hoge", 0, 0 );
    }
    public Syohin(String n,int p,int t){
        this.name = n;
        this.price = p;
        this.tax = t; 
    }
    void show(){

        System.out.printf("%s : %d 円",this.name,this.price);
    }
    void showTax(){
        int naizei = (int) (this.price * this.tax * 0.01); 
        System.out.printf("( + 税 : %d 円)",naizei);
    }
}