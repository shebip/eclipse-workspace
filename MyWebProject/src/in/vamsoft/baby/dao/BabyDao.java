/*package in.vamsoft.baby.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.vamsoft.baby.bean.Baby;

public class BabyDao {
  public static Connection getConnection() throws ClassNotFoundException {
    Connection conn = null;
    try {
      Class.forName("org.postgresql.Driver");
      conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/shebidb", "shebi", "$HEBI123");
      return conn;

    } catch (SQLException e) {

      e.printStackTrace();
    }
    
    public static int save(Baby b){
      int status=0;
      try{
        Connection con=getConnection();
        PreparedStatement ps=con.prepareStatement("insert into babyname(id,name,meaning,sex,religion) values(?,?,?,?,?)");
        ps.setInt(1, b.getBabyId());
        ps.setString(2,b.getName());
        ps.setString(3,b.getMeaning());
        ps.setString(4,b.getSex());
        ps.setString(5,b.getReligion());
        status=ps.executeUpdate();
        con.close();
        return con;
      }catch(Exception e){System.out.println(e);}
      
    }

  }

}
*/