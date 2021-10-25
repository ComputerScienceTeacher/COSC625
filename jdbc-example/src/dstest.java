import java.sql.*;
import org.sqlite.*;

public class dstest {

	static SQLiteDataSource ds = new SQLiteDataSource();
	
	public static void newDS() {

		ds.setUrl("jdbc:sqlite:test.db");
		try { Connection conn = ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addTable()
	{
		ds.setUrl("jdbc:sqlite:test.db");
		try { Connection conn = ds.getConnection();
		Statement smt = conn.createStatement();
		
		
		String sql = "CREATE TABLE STUDENT (first VARCHAR(255), last VARCHAR(255), age INTEGER)";
		smt.executeUpdate(sql);
		System.out.println("TableCreated");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void showTables() {
		ds.setUrl("jdbc:sqlite:test.db");
		
		try { Connection conn = ds.getConnection();
		Statement smt = conn.createStatement();
		String[] types = {"TABLE"};
		
		
		DatabaseMetaData meta = conn.getMetaData();
		ResultSet tables = meta.getTables(null, null, "%" , types);
		
		while(tables.next()) {
			System.out.println(tables.getString("TABLE_NAME"));
		}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void printStu() {
		ds.setUrl("jdbc:sqlite:test.db");
		try 
		{
		Connection conn = ds.getConnection();
		Statement smt = conn.createStatement();
		ResultSet rs = smt.executeQuery("SELECT first, last, age FROM STUDENT;");
		System.out.println(rs);
		}
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//addTable();
		printStu();
		System.out.println("done");
	}
}

