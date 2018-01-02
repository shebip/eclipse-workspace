package DaoSample;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class EmployeeDaoImpl implements EmployeeDao {
	Connection connection;
	public static Logger logger=Logger.getLogger(EmployeeDaoImpl.class);
	
	@Override
	public boolean addEmployee(Employee emp)  {
		try (PreparedStatement statement=connection.prepareStatement
				("insert into empDemo1 values(?,?,?,?,?)");){
			
			statement.setInt(1, emp.getEmpId());
			statement.setString(2, emp.getEmpName());
			statement.setDouble(3, emp.getSalary());
			statement.setDate(4, Date.valueOf(emp.getDoj()));
			statement.setInt(5, emp.getDeptId());
			int updatedRow=statement.executeUpdate();
			return updatedRow > 0 ?true:false;
		} catch (SQLException e) {
			
			logger.error("Employee not found");
		}
		return false;
		
	}

}
