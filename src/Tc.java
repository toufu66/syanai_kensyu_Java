
public class Tc {
    String name;
    int grd,cls;
    public Tc(String nm){
        this.name = nm;

    }
    void show(){
        if((this.grd == 0) ){
            System.out.printf("%s 担当なし",this.name); 
        }else{
           System.out.printf("%s %d年%d組　担任",this.name,this.grd,this.cls);
        }
    }
    
    void show(String a){

    }
}