package online_shopping_store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class testproject {

	public static void main(String[] args) {
		String a = "pavithra";
		String b = "pavithra";
		if(Validation.matchPassword(a, b)) {
			System.out.println("a == b");
		}
		else {
			System.out.println("a!=b");
		}
		
		
	}
		

}
