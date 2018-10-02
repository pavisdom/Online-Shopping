package online_shopping_store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class testproject {

	public static void main(String[] args) {
		String a = "123";
		String b = "11";
		if(Login.validatePwd(a, b)) {
			System.out.println("pwd currect");
		}
		else {
			System.out.println("pwd wrong");
		}
		
		
		
		
	}
		

}
