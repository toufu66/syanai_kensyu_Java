package seiseki;

public class St {
    
    String name;
    int koku;
    int mt;
    int sya;
    public St(String n,int a,int b,int c){
        this.name = n;
        this.koku = a;
        this.mt = b;
        this.sya = c;

    }
    void show(){

        System.out.printf("%s 国語:%d点, 算数:%d点, 社会:%d点",this.name,this.koku,this.mt,this.sya);
    }
    int sum(){
        return(this.koku + this.mt + this.sya);
    }
    double ave(){
        return sum()/3.;
    }
}