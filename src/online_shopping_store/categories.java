package online_shopping_store;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class categories {
 public static ArrayList<String> getCategories() {
	 try {
			
			
			ResultSet Cat = DBConnector.DBquery("select * from categories");
			
			//process results
			ArrayList <String> results = new ArrayList<String>();
			while(Cat.next()) {
				
				results.add(Cat.getString("catName"));
			}
			return results;
	 
	 	}
	 catch(Exception ex) {
			ex.printStackTrace();
			return null;

		}
}
 public static ArrayList <String> bla(){
	 ArrayList <String> w = new ArrayList();
	 w.add("DFf");
	 w.add("fewcvf");
	 return w;
 }



}
