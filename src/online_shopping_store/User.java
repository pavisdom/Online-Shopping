package online_shopping_store;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class User implements DBConnector,Validation{
	private int cid;
	private String cname;
	private String cAddress;
	private String email;
	private String cpwd;
	private String ciurl;
	protected static User currentUser = null;
	protected static User logedUser = null;
	
	private User(int cid) { //private constructor to exist user
		// TODO set values where userID = cid
		this.cid = cid;
		syncDB();
	}
	private User() { //private constructor to exist user
		// TODO  setCid(max(userID) ++) and add new row for customer table
		int lastCid = 0;
		try {
			ResultSet lstID = DBConnector.DBquery("select max(userID) from customers");
			while(lstID.next()) {
				lastCid = lstID.getInt("max(userID)");
			}
			this.cid = lastCid+1;
			DBConnector.newConnection().createStatement().executeUpdate("insert into customers(userID) values ("+this.cid+")");
		}catch(Exception e) {
			e.printStackTrace();
		}

		
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpwd() {
		return cpwd;
	}
	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
	public String getCiurl() {
		return ciurl;
	}
	public void setCiurl(String ciurl) {
		this.ciurl = ciurl;
	}
	
	public static User login(int cid) { // singleton
		if(currentUser == null) {
			currentUser =  new User(cid);
		}
		return currentUser;
		
	}
	public static User createNew() { //singleton
		if(currentUser == null) {
			currentUser = new User();
		}
		return currentUser;
	}
	
	public static void logout(){
		currentUser = null;
		LoginServlet.destroyUserSession();
	}
	
	public static boolean isLogged() {
		if(logedUser == null)
			return false;
		return true;
	}
	
	public void syncDB() { // override dbconnector method
		try {
			ResultSet user = DBConnector.DBquery("select * from customers where userID = "+this.cid);
			while(user.next()) {
			this.cname = user.getString("cName");
			this.cAddress = user.getString("address");
			this.email = user.getString("email");
			this.cpwd = user.getString("password");
			this.ciurl = user.getString("pictureURL");
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();

		}
		
		
	}
	
	public void updateDB() { // override dbconnector method
		try {
			DBConnector.newConnection().createStatement().executeUpdate("update customers set cName = '"+this.cname+"' where userID = "+this.cid);
			DBConnector.newConnection().createStatement().executeUpdate("update customers set address = '"+this.cAddress+"' where userID = "+this.cid);
			DBConnector.newConnection().createStatement().executeUpdate("update customers set email = '"+this.email+"' where userID = "+this.cid);
			DBConnector.newConnection().createStatement().executeUpdate("update customers set password = '"+this.cpwd+"' where userID = "+this.cid);
			DBConnector.newConnection().createStatement().executeUpdate("update customers set pictureURL = '"+this.ciurl+"' where userID = "+this.cid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static boolean isMailExist(String email) {
		
		try {
				ResultSet mail = DBConnector.DBquery("select * from customers");
			
				//process results
			while(mail.next()) {
					if (email.equals(mail.getString("email")))
						return true;
			}
			return false;
			
	 
	 	}
	 catch(Exception ex) {
			ex.printStackTrace();
			return (Boolean) null;

		}
	}
	
	public static User getLogedUser() {
		return logedUser;
	}
	public static void setLogedUser(User logedUser) {
		User.logedUser = logedUser;
	}
	

}
