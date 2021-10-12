/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dboperation;


import dbdriver.DBDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author VOSTRO2557
 */
public class LoginDBOperation {
    
    public boolean checkAdminLogin(String uname, String pass)
    {
        boolean flag=true;

        try
        {

             Statement st= new DBDriver().getStatment();
             String query="Select * from admininfo where Username='"+uname+"'and Password='"+pass+"'";
             ResultSet rs=st.executeQuery(query);
            
            if(rs.next())
            {
             flag=true;   
            }
            
            else
            {
                flag=false;
            }
          
            st.close();
        }

        catch(Exception e)
        {
            System.out.println("Exeption in LoginDBOperation Class in checkAdminLogin method() is: "+e);
            flag=false;
        }




        return flag;
    }
    
     public boolean checkStaffLogin(String uname, String pass)
    {
        boolean flag=true;

        try
        {

             Statement st= new DBDriver().getStatment();
             String query="Select * from newstaffinfo where Username='"+uname+"'and Password='"+pass+"'";
             ResultSet rs=st.executeQuery(query);
            
            if(rs.next())
            {
             flag=true;   
            }
            
            else
            {
                flag=false;
            }
          
            st.close();
        }

        catch(Exception e)
        {
            System.out.println("Exeption in LoginDBOperation Class in checkStaffLogin method() is: "+e);
            flag=false;
        }




        return flag;
    }
    
}
