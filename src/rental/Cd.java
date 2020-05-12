package rental;

public class Cd extends Item{
    public int getPrice(){
        return 300+ 100*(this.day-1);
    }
    public Cd(String n,int d){
        super(n, d);
    }
    
}