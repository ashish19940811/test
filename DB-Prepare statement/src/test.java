import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class test
{

	/**
	 * @param args
	 */
	static String url="jdbc:mysql://localhost:3306/student";
    	static	String user="root";
	static String password="";
	private static final String sql_insert="insert into stud(stu_name,rollno)values(?,?)";
	public static void main(String[] args) 
	{
     try
		{
			Connection mycon=(Connection) DriverManager.getConnection(url,user,password);
			PreparedStatement ps=(PreparedStatement) mycon.prepareStatement(sql_insert);
			ps.setString(1,"Ashish");
			ps.setInt(2,100);
			
			int row=ps.executeUpdate();
			System.out.println(row);
		}
        /*catch(SQLException e)
       {
    	 System.out.print("SQl State: %s\n%s",e.getSQLState(),e.getMessage());
    	   
       } */
     catch (Exception e) 
     {
         e.printStackTrace();
     }
     
		
		

	}

}
