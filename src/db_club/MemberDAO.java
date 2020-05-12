package db_club;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

public class MemberDAO {
    static final String URL =  "jdbc:mysql://localhost/club?useSSL=false";
    static final String USER = "java";
    static final String PASS = "password";
    public ArrayList<Member> findALL(){
        ArrayList<Member> l = new ArrayList<Member>();
        try(Connection con = DriverManager.getConnection(URL,USER,PASS)){
            //Class.forName("com.mysql.jdbc.Driver");
            
            final String sql = "select * from member";
            final PreparedStatement stmt = con.prepareStatement(sql);
            final ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                final int sid = rs.getInt("sid");
                final int uid = rs.getInt("uid");
                final int num = rs.getInt("kosu");
                final Date day = rs.getDate("hi");
                final Member e = new Member( mid, name,address);
                l.add(e);
            }

            stmt.close();

        } catch (final SQLException e) {
            System.out.println("Find ALLエラー：" + e.getMessage());
        }
        return l;
    }

    public void insert(final String n, final String a) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            // Class.forName("com.mysql.jdbc.Driver");
            final String sql = String.format("INSERT INTO member (name,adress) VALUES('%s',%s)", n, v);
            final PreparedStatement stmt = con.prepareStatement(sql);

            stmt.executeUpdate();

            stmt.close();

        } catch (final SQLException e) {
            System.out.println("INSERTエラー：" + e.getMessage());
        }
    }

    public void update(final int i, final String n, final String a) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            // Class.forName("com.mysql.jdbc.Driver");
            final String sql = "UPDATE member set name = '?' ,adress = '?'  where sid = ?" ;
            final PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, n);
            stmt.setString(2, a);
            stmt.setInt(3, i);

            stmt.executeUpdate();

            stmt.close();

        } catch (final SQLException e) {
            System.out.println("UPDATEエラー：" + e.getMessage());
        }
    }


    public ArrayList<Member> findBysID(int sid){
        ArrayList<Member> l = new ArrayList<Member>();
        try(Connection con = DriverManager.getConnection(URL,USER,PASS)){
            //Class.forName("com.mysql.jdbc.Driver");
            
            final String sql = String.format("select * from uriage where sid = %d",sid);
            
            final PreparedStatement stmt = con.prepareStatement(sql);
            final ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                
                final int uid = rs.getInt("uid");
                final int num = rs.getInt("kosu");
                final Date day = rs.getDate("hi");
                final Member e = new Member( mid, name,address);
                l.add(e);
            }

            stmt.close();

        } catch (final SQLException e) {
            System.out.println("Find By SIDエラー：" + e.getMessage());
        }
        return l;
    }
}