package DaoSample;

import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import in.vamsoft.log4j.DBConnectionUtil;

public class daoBatch {

	public static void main(String[] args) {
		try (Connection con=DBConnectionUtil.getConnection();
				PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?,?,?,?)");
				Scanner s=new Scanner(System.in);
				Scanner s1=new Scanner(System.in)){
			String answer="no";
			do {
				System.out.println("Enter ID");
				int id= s.nextInt();
				System.out.println("Enter Name");
				String name= s1.next();
				System.out.println("Enter salary");
				double sal=s.nextDouble();
				String doj=s1.next();
				int deptid=s.nextInt();
				LocalDate localDate=LocalDate.parse(doj,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				java.sql.Date hireDate=java.sql.Date.valueOf(localDate);
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setDouble(3, sal);
				ps.setDate(4, hireDate);
				ps.setInt(5,deptid);
				ps.addBatch();
				System.out.println("Do you to insert(yes/no)");
				answer=s1.next();
			}while(answer.equalsIgnoreCase("yes"));
			int[] rowInserted =ps.executeBatch();
			for(int row:rowInserted) {
				if(row!=0)
					System.out.println(row+"rows inserted");
				else
					System.out.println("No rows are inserted");
			}
			}
			catch(SQLException e) {
				
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
					
				
				
				
				

	}

}
