package in.pwskills.kalyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskills.kalyan.beans.CustomerBO;

@Component("dao")
public final class CustomerDaoImpl implements ICustomerDao {
	
	private static final String SQL_INSERT_QUERY = "INSERT INTO customer(`cname`,`caddr`,`pamt`,`rate`,`time`,`si`) values(?,?,?,?,?,?)"; 
	//INJECTING Datasource object in the Dao Layer and we need to bind it
	/*NOTE => at this moment in IOC cache no object is present so to link 
	it using AutoWired we need to create a bean and then using pure java format we need to tell IOC container to create the object 
	using only @AutoWired wont work in the background we will have to tell the IOC container to create the object of the datasource bean*/
	@Autowired
	private DataSource dataSource;

	@Override
	public int insert(CustomerBO bo)throws Exception {
		
		//System.out.println(dataSource);
		
		//Writing ourt business logic
		
		int count = 0;
		
		try(Connection connection = dataSource.getConnection();){
			PreparedStatement prepareStatement = connection.prepareStatement(SQL_INSERT_QUERY);
			
			//set the values 
			prepareStatement.setString(1,bo.getCustName());
			prepareStatement.setString(2,bo.getCustAddr());
			prepareStatement.setFloat(3,bo.getPamt());
			prepareStatement.setFloat(4,bo.getRate());
			prepareStatement.setFloat(5,bo.getTime());
			prepareStatement.setFloat(6,bo.getInterestAmount());
			
			count = prepareStatement.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw e;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}

}
