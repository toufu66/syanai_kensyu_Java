package rental;

public class Book extends Item{
    public int getPrice(){
        return 50*this.day;
    }
    public Book(String n,int d){
        super(n, d);
    }
    
    
}