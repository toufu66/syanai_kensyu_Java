package db;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesDAO {

    public static String URL;
    public static String USER;
    public static String PASS;

    public SalesDAO(){
        this("jdbc:mysql://localhost/sales?useSSL=false","java","password");

    }

    public SalesDAO(String url,String usr,String pass){
        this.URL=url;
        this.USER=usr;
        this.PASS = pass;
    }

    public void findALL(){
        try(Connection con = DriverManager.getConnection(URL,USER,PASS)){
            //Class.forName("com.mysql.jdbc.Driver");
            
            String sql = "select * from shouhin";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                int sid = rs.getInt("sid");
                String sname = rs.getString("sname");
                int tanka = rs.getInt("tanka");
                System.out.println(sid + " " +sname+" "+tanka);
            }
            //stmt.executeUpdate();
        
            stmt.close();
        
        }catch (SQLException e) {
            System.out.println("Find ALLエラー：" + e.getMessage());
        }
    }
    public void insert(String n,int v){
        try(Connection con = DriverManager.getConnection(URL,USER,PASS)){
            //Class.forName("com.mysql.jdbc.Driver");
            String sql = String.format("INSERT INTO shouhin (sname,tanka) VALUES('%s',%d)",n,v);
            PreparedStatement stmt = con.prepareStatement(sql);
        
            stmt.executeUpdate();
        
            stmt.close();
        
        }catch (SQLException e) {
            System.out.println("INSERTエラー：" + e.getMessage());
        }
    }

    public void update(int i,String n,int v){
        try(Connection con = DriverManager.getConnection(URL,USER,PASS)){
            //Class.forName("com.mysql.jdbc.Driver");
            String sql = "UPDATE shouhin set sname = '"+ n + "',tanka = " + v + " where sid = "+ i;
            PreparedStatement stmt = con.prepareStatement(sql);
        
            stmt.executeUpdate();
        
            stmt.close();
        
        }catch (SQLException e) {
            System.out.println("UPDATEエラー：" + e.getMessage());
        }
    }
    public void findByID(int i){
        try(Connection con = DriverManager.getConnection(URL,USER,PASS)){
            //Class.forName("com.mysql.jdbc.Driver");
            
            String sql = String.format("select * from shouhin where sid = %d",i);
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String sname = rs.getString("sname");
                int tanka = rs.getInt("tanka");
                System.out.println(sname+""+tanka);
            }
            //stmt.executeUpdate();
        
            stmt.close();
        
        }catch (SQLException e) {
            System.out.println("Find by sIDエラー：" + e.getMessage());
        }
    }

}