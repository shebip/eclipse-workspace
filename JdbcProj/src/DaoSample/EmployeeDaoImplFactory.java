package DaoSample;



import org.apache.log4j.Logger;

import in.vamsoft.log4j.JdbcDemo;

public class EmployeeDaoImplFactory {

	public static Logger logger=Logger.getLogger(JdbcDemo.class);
	public static EmployeeDaoImpl getEmployeeDaoImplobj(Employee emp) throws ClassNotFoundException
	{
		
		EmployeeDaoImpl impl=null;
		impl=new EmployeeDaoImpl();
		return impl;
	}
}
