package online_shopping_store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public interface DBConnector {
	public static Connection newConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/online_shopping?useSSL=false", "root", "root");
	}
	public static ResultSet DBquery(String query) {
		try{//connect to database
		Connection myc = newConnection();
		//create statement
		Statement mys = myc.createStatement();
		
		//execute sql query
		ResultSet rs = mys.executeQuery(query);
		
		//process results
		return rs;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return null;

		}
		
	}
	
	public void syncDB();
	public void updateDB();
}
