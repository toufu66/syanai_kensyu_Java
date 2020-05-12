package seiseki;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList <Jc>  jcs = new ArrayList<Jc>();

        jcs.add(new Jc("安倍晋子",100,100,500,30));
        jcs.add(new Jc("伊藤博文",10,10,50,3));
        jcs.add(new Jc("橋本環奈",1000,1000,5000,300));

        //st1.show();
        //System.out.println(st1.sum() + "点");
        //System.out.println(st1.ave());
        for (Jc j:jcs){
            System.out.println(j.sum());
        }
    }
}