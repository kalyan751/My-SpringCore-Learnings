package in.pwskills.kalyan.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "MySqlDao1")
public class EmployeeMySQL1DaoImpl implements IEmployeeDao {
    @Autowired
	private DataSource ds;
    
	@Override
	public void getConnection() {
		System.out.println(ds);
	}
	
}
