package rental;

public abstract class Item {
    String name;
    int day;
    public Item(String n,int d){
        this.name = n;
        this.day = d;
    }
    public abstract int getPrice();

    public String toString(){
        return this.name + " "+ day + "日";
    }

}