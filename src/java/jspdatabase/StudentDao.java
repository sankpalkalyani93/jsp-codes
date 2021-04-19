/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspdatabase;

import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
/**
 *
 * @author kalyani
 */
public class StudentDao {
    
    public static Connection getConnection(){  
        Connection con=null;  
        
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost/stud_db_01", "root", "");  
        }catch(Exception e){
            
            System.out.println(e);
        }  
        return con;  
    }  

    public static int save(Student stud){  
        int status=0;  
    
        try{  
            Connection con=getConnection();  
            PreparedStatement ps=con.prepareStatement("insert into student(id,name,password,email,gender,country) values(?,?,?,?,?,?)");  
            ps.setInt(1,stud.getId());
            ps.setString(2,stud.getName());  
            ps.setString(3,stud.getPassword());  
            ps.setString(4,stud.getEmail());  
            ps.setString(5,stud.getGender());  
            ps.setString(6,stud.getCountry());  
            
            status=ps.executeUpdate();  
        }catch(Exception e){
            
            System.out.println(e);
        }  
        
        return status;  
    }  
    
    public static int update(Student stud){  
        int status=0;  
    
        try{  
            Connection con=getConnection();  
            PreparedStatement ps=con.prepareStatement("update student set name=?,password=?,email=?,gender=?,country=? where id=?");  
            ps.setInt(1,stud.getId());
            ps.setString(2,stud.getName());  
            ps.setString(3,stud.getPassword());  
            ps.setString(4,stud.getEmail());  
            ps.setString(5,stud.getGender());  
            ps.setString(6,stud.getCountry());  
              
            status=ps.executeUpdate();  
        }catch(Exception e){
            
            System.out.println(e);
        }  
        
        return status;  
    }
    
    public static int delete(Student stud){  
        int status=0;  
        
        try{  
            Connection con=getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from student where id=?");  
            ps.setInt(1,stud.getId());  
            
            status=ps.executeUpdate();  
        }catch(Exception e){
            
            System.out.println(e);
        }  
        
        return status;  
    }
    
    public static List<Student> getAllRecords(){  
        List<Student> list=new ArrayList<Student>();  
      
        try{  
            Connection con=getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from student");  
            ResultSet rs=ps.executeQuery();  
        
            while(rs.next()){  
               
                Student stud=new Student();  
                stud.setId(rs.getInt("id"));  
                stud.setName(rs.getString("name"));  
                stud.setPassword(rs.getString("password"));  
                stud.setEmail(rs.getString("email"));  
                stud.setGender(rs.getString("gender"));  
                stud.setCountry(rs.getString("country"));  
                
                list.add(stud);  
            }  
        }catch(Exception e){
            
            System.out.println(e);
        }  
    
        return list;  
    }
    
    public static Student getRecordById(int id){  
        
        Student stud=null;  
        
        try{  
            Connection con=getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from student where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
        
            while(rs.next()){  
                stud=new Student();  
                stud.setId(rs.getInt("id"));  
                stud.setName(rs.getString("name"));  
                stud.setPassword(rs.getString("password"));  
                stud.setEmail(rs.getString("email"));  
                stud.setGender(rs.getString("gender"));  
                stud.setCountry(rs.getString("country"));  
            }     
        }catch(Exception e){
            
            System.out.println(e);
        }  
        return stud;  
    }  
}