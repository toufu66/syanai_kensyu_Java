package sukkiri;

public class Book  extends Syohin{
    String at; //author
    public Book(String n,int p, int t, String author){
        super(n,p,t);
        this.at = author;
    }

    void show(){

        super.show();
    }

}