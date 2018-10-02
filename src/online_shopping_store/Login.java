package online_shopping_store;

import java.sql.ResultSet;

public class Login {
 
	
	public static boolean validatePwd(String email,String pwd) {
		boolean match = false;
		if(User.isMailExist(email)) {
			try {
				ResultSet password = DBConnector.DBquery("select * from customers where email ='"+email+"'");
			
				//check password are matched
					while(password.next()) {
							if (pwd.equals(password.getString("password")))
								match= true;
							User.login(password.getInt("userID"));
							
					}
					
			}catch(Exception ex) {
			ex.printStackTrace();
				}
		}
		
		return match;
		
	}
}
