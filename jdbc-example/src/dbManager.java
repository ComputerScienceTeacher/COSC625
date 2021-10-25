import java.sql.*;
import org.sqlite.*;
import java.util.Scanner;

public class dbManager {

	static SQLiteDataSource ds = new SQLiteDataSource();

	public static void newStudent () {
	Scanner sc = new Scanner(System.in);
	String first;
	String last;
	String age;
	
	String bool = " ";
	
	while (bool.charAt(0) != 'y') 
	
	{
		System.out.println("Please input students first name: ");
		first = sc.nextLine();
		System.out.println("Please input students last name: ");
		last = sc.nextLine();
		System.out.println("Please input students Age: ");
		age = sc.nextLine();
	
		System.out.println("Is this correct y/n?\nStudent Name: " + first + " " + last + "\nAge: " + age);
		bool = sc.next();
	
		if (bool.charAt(0) == 'y')
			{System.out.println("Thank You");}
		else 
		{
			System.out.println("Please Try Again");
		}
		
		ds.setUrl("jdbc:sqlite:test.db");
		try 
		{ 
			Connection conn = ds.getConnection();	
			String sql = "INSERT INTO STUDENT (first, last, age) VALUES (\'" + first + "\', \'" + last + "\', \'" + age + "\')";
			System.out.println(sql.toString());
			Statement smt = conn.createStatement();
			smt.executeUpdate(sql);
			System.out.println("SQL Statement executed");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	sc.close();
	}
	
	
	public static void main(String[] args) {
		newStudent();
	}

}
