package rental;
import java.util.ArrayList;

public class Rental {

    ArrayList<Item> list = new ArrayList<Item>();
    public void add(Item i){
        this.list.add(i);
    }
    public void show(){
        for(Item l:this.list){
            System.out.println(l.toString()+ l.getPrice()+"円");
        }
    }
    public int sum(){
        int s = 0;
        for(Item l:this.list){
        s+=l.getPrice();
        }
        return s;
    }
}