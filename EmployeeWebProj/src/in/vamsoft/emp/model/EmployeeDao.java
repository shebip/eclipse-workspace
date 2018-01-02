package in.vamsoft.emp.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.vamsoft.dao.*;

public class EmployeeDao {

  Connection con;
  public EmployeeDao() {

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.102:1521:XE","hr","password");
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }catch(SQLException e) {
      e.printStackTrace();
    }
    
  }
  public List<Employee> getAllDepartment(){
    List<Employee> employees=new ArrayList<>();
    ResultSet rs = null;
    try(PreparedStatement statement = con.prepareStatement("select department_id,department_name from department"))
        {
      rs=statement.executeQuery();
      while(rs.next()) {
        Employee employee=new Employee();
        employee.setDeptId(rs.getInt(1));
        employee.setEmpName(rs.getString(2));
     
        employee.setSalary(rs.getDouble(3));
        employees.add(employee);
      }
    }catch(SQLException e) {
      
    }
    finally {
      try {
        
        rs.close();
      }catch(SQLException e) {
        e.printStackTrace();
      }
    }
    return employees;
    
  }

  
}

