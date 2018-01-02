package in.vamsoft.log4j;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class UpdateTable {
	 public static Logger logger = Logger.getLogger(UpdateTable.class);
	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		s.nextInt();
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		//connection=DBConnectionUtil.getConnection();
		
		try {
			preparedStatement=connection.prepareStatement("Update empshebi set salary+? where empid=?");
			int amount;
    //  preparedStatement.setInt(1, amount);
			int empid;
      //preparedStatement.setInt(2, empid);
			int rowsUpdated=preparedStatement.executeUpdate();
			System.out.println(rowsUpdated+"rows updated");
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					preparedStatement.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			//	DBConnectionUtil.closeConnection();
			}
	}

}
