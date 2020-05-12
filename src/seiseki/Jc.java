package seiseki;

public class Jc extends St {
    int eng;
    public Jc(String n,int a,int b,int c,int d){
        super(n,a,b,c);
        this.eng = d;
    }
    int sum(){
        return super.sum() + this.eng; 
    }
    double ave(){
        return this.sum()/4.;
    }
    
}