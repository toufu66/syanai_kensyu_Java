package event;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Event {
    ArrayList<Member> ml = new ArrayList<Member>();
    String eName;
    Date day;
    public Event(String name){
        Date d = new Date();
        this.eName=name;
        this.day = d;
    }

    public void add(Member m){
        this.ml.add(m);
    }
    public void show(){
        System.out.println(this.eName);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy '年' MM '月' dd '日'");        
        System.out.println(sdf.format(this.day));
        for(Member m:ml){
            m.showMem();
        }        

    }

}