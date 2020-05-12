package db;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

public class EarningDAO {
     

    static final String URL =  "jdbc:mysql://localhost/sales?useSSL=false";
    static final String USER = "java";
    static final String PASS = "password";

    public ArrayList<Earning> findALL(){
        ArrayList<Earning> l = new ArrayList<Earning>();
        try(Connection con = DriverManager.getConnection(URL,USER,PASS)){
            //Class.forName("com.mysql.jdbc.Driver");
            
            final String sql = "select * from uriage";
            final PreparedStatement stmt = con.prepareStatement(sql);
            final ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                final int sid = rs.getInt("sid");
                final int uid = rs.getInt("uid");
                final int num = rs.getInt("kosu");
                final Date day = rs.getDate("hi");
                final Earning e = new Earning(sid, uid, num, day);
                l.add(e);
            }

            stmt.close();

        } catch (final SQLException e) {
            System.out.println("Find ALLエラー：" + e.getMessage());
        }
        return l;
    }

    public void insert(final String n, final int v) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            // Class.forName("com.mysql.jdbc.Driver");
            final String sql = String.format("INSERT INTO shouhin (sname,tanka) VALUES('%s',%d)", n, v);
            final PreparedStatement stmt = con.prepareStatement(sql);

            stmt.executeUpdate();

            stmt.close();

        } catch (final SQLException e) {
            System.out.println("INSERTエラー：" + e.getMessage());
        }
    }

    public void update(final int i, final String n, final int v) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            // Class.forName("com.mysql.jdbc.Driver");
            final String sql = "UPDATE shouhin set sname = '" + n + "',tanka = " + v + " where sid = " + i;
            final PreparedStatement stmt = con.prepareStatement(sql);

            stmt.executeUpdate();

            stmt.close();

        } catch (final SQLException e) {
            System.out.println("UPDATEエラー：" + e.getMessage());
        }
    }


    public ArrayList<Earning> findBysID(int sid){
        ArrayList<Earning> l = new ArrayList<Earning>();
        try(Connection con = DriverManager.getConnection(URL,USER,PASS)){
            //Class.forName("com.mysql.jdbc.Driver");
            
            final String sql = String.format("select * from uriage where sid = %d",sid);
            
            final PreparedStatement stmt = con.prepareStatement(sql);
            final ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                
                final int uid = rs.getInt("uid");
                final int num = rs.getInt("kosu");
                final Date day = rs.getDate("hi");
                final Earning e = new Earning(sid, uid, num, day);
                l.add(e);
            }

            stmt.close();

        } catch (final SQLException e) {
            System.out.println("Find By SIDエラー：" + e.getMessage());
        }
        return l;
    }
}