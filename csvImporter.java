/*
 * This class is a tool to import a csv file and import it into a SQL table in a database
 * 
 * 
 */

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.sqlite.*;


public class csvImporter {

	static SQLiteDataSource ds = new SQLiteDataSource();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tool = 9;
		while(tool > 0) {
			System.out.println("Please specify which function you would like to use:\nNew Course Table:\t1\nImport Course CSV:\t2\nExit Program:\t\t3");
			tool = sc.nextInt();
			if (tool == 1)
				addCourseTable();
				System.exit(0);
			if (tool == 2)
				csvImport();
			if(tool == 3)
				System.exit(0);
		}
		sc.close();
	}
	
	/*
	 * This Method initializes the Course Table in the SQL Database	 * 
	 */
	public static void addCourseTable()
	{
		ds.setUrl("jdbc:sqlite:test.db");
		try { Connection conn = ds.getConnection();
		Statement smt = conn.createStatement();
		String sql = "CREATE TABLE COURSE (Name VARCHAR(255), CourseID VARCHAR(255), NumberOfCredits FLOAT, "
				   + "CourseLevel INTEGER, NumberOfStudents INTEGER, CoursePreRequisite VARCHAR(255), CourseCoRequisite VARCHAR(255) )";
		
		smt.executeUpdate(sql);
		System.out.println("TableCreated");
		
		} catch (SQLException e) {
			System.out.println("Unhandled SQL Exception");
			e.printStackTrace();
		}
	}
	
	public static void csvImport() {
		
		//Set relative paths for DB and CSV
		ds.setUrl("jdbc:sqlite:test.db");
		String csvPath = "Core_Courses.csv";
		
		//These Vars are for all the columns in the Core Courses Table
		String Name;
		String CourseID;
		float NumberOfCredits;
		int CourseLevel;
		int NumberOfStudents;
		String CoursePreRequisite;
		String CourseCoRequisite;
		
				
		//Set up Line Reader for CSV
		try {
			BufferedReader lineReader = new BufferedReader(new FileReader(csvPath));
			//This skips the header line
			String line = lineReader.readLine();
		
			Connection conn = ds.getConnection();
			Statement smt = conn.createStatement();	
			
			// This while loop goes through the whole CSV Iteratively
			while (line != null) {
				String currentLine[] = line.split(",");
				
				Name = currentLine[0];
				CourseID = currentLine[1];
				NumberOfCredits = Float.valueOf(currentLine[2]);
				CourseLevel = Integer.valueOf(currentLine[3]);
				NumberOfStudents = Integer.valueOf(currentLine[4]);
				CoursePreRequisite = currentLine[5];
				CourseCoRequisite = currentLine[6];				
				
				String sql =	"INSERT INTO COURSE (Name, CourseID, NumberOfCredits, CourseLevel, NumberOfStudents, CoursePreRequisite, CourseCoRequisite) VALUES"
						+ "(\'" + Name + "\'," + "\'" + CourseID + "\'," + "\'" + NumberOfCredits + "\'," + "\'" + CourseLevel + "\'," + "\'" + NumberOfStudents + "\'," + "\'" + CoursePreRequisite + "\'," + "\'" + CourseCoRequisite + "\',";
							
				smt.addBatch(sql);
				line = lineReader.readLine();
			}
			
			System.out.println("Finished Importing CSV");
			lineReader.close();

		
		} catch (FileNotFoundException e) {
			System.out.println("Course List Not Found. Error");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO Exception");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Unhandled SQL Exception");
			e.printStackTrace();
		}
		

	}
}



