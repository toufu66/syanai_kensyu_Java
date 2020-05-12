package db;

public class DBSample {
    //定数宣言
    static final String URL =  "jdbc:mysql://localhost/sales?useSSL=false";
    static final String USER = "java";
    static final String PASS = "password";

    // メソッド内
    public static void main(String[] a){
        SalesDAO sd = new SalesDAO();
        //sd.update(5, "ももmomo", 7000);
        //sd.findALL();
        //sd.insert("やまなしのなし", 10);    
        sd.findALL();
    }   
}