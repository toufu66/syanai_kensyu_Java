package db;

import java.sql.Date;

public class Earning {
    int uid;
    int sid;
    int num;
    Date day;//hi
    Earning(int a,int b,int c, Date d){
        this.uid = a;
        this.sid = b;
        this.num = c;
        this.day = d;
    }
    
}