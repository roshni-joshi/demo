package dao;
import java.sql.*;
import java.util.*;

import javax.management.Query;

import vo.RegisterVO;

public class RegisterDAO {
	
	Connection c = null;
	Statement stmt = null;
	
	public void insert(RegisterVO v)
	{
		try 
		{
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres", "root");
			stmt = c.createStatement();

			String sql = "insert into student(firstname,lastname) values ('"+v.getFn()+"','"+v.getLn()+"')";
		    stmt.executeUpdate(sql);
		    stmt.close();
		    c.close();
	
		}catch (Exception e) {}
	}
	
	public List search()
	{
		List ls = new ArrayList();
		try 
		{
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres", "root");
			stmt = c.createStatement();

			String sql = "select * from student";
		    ResultSet rs = stmt.executeQuery(sql);
		    
		    while(rs.next())
		    {
		    	RegisterVO v = new RegisterVO();
		    	v.setId(rs.getInt("id"));
		    	v.setFn(rs.getString("firstname"));
		    	v.setLn(rs.getString("lastname"));
		    	ls.add(v);
		    }		    
		    stmt.close();
		    c.close();
	
		}catch (Exception e) {}
		
		return ls;
	}
	
	public void delete(RegisterVO v)
	{
		try 
		{
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres", "root");
			stmt = c.createStatement();

			String sql = "delete from student where id="+v.getId();
		    stmt.executeUpdate(sql);
		    stmt.close();
		    c.close();
	
		}catch (Exception e) {}
	}

	public void update(RegisterVO v)
	{
		try 
		{
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres", "root");
			stmt = c.createStatement();
		
			String sql = "update student set firstname='"+v.getFn()+"', lastname='"+v.getLn()+"' where id='"+v.getId()+"'";
		    stmt.executeUpdate(sql);
		    stmt.close();
		    c.close();
	
		}catch (Exception e) {}
	}

}
