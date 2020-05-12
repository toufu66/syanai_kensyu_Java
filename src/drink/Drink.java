package drink;

public class Drink {
    String name;
    int amount;
    public Drink(){
        this("コーラ",500);
    }
    public Drink(String n,int a){
        this.name = n;
        this.amount = a;
    }
    void show(){
        System.out.println(this.name + this.amount + "ml");
    }
}