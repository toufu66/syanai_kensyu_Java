package db;

import java.util.Scanner;
public class Emain {
    public static void main(String[] a){
        EarningDAO e = new EarningDAO();
        for (Earning i:e.findALL()){
            System.out.printf("%d %d %d %s \n",i.sid,i.uid,i.num,i.day);
        }
        Scanner s = new Scanner(System.in);
        System.out.println("SID 入力");
        for (Earning i:e.findBysID(s.nextInt())){
            System.out.printf("%d %d %d %s \n",i.sid,i.uid,i.num,i.day);
        }
        s.close();        
    }
    
}