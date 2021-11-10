/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dboperation;

import dbdriver.DBDriver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 1450
 */
public class StockDBOperation {
    
    public boolean addOpeningStockInfo(String iname, String hsncode, String oquantity, String ounit, String orate, String ovalue, String iquantity, String iunit, String irate, String ivalue,String owquantity, String owunit, String owrate, String owvalue,String cquantity, String cunit, String crate, String cvalue )
    {
        boolean flag=true;

        try
        {

            
             Statement st= new DBDriver().getStatment();
             String query="Insert into stockinfo values('"+iname+"','"+hsncode+"','"+oquantity+"','"+ounit+"','"+orate+"','"+ovalue+"','"+iquantity+"','"+iunit+"','"+irate+"','"+ivalue+"','"+owquantity+"','"+owunit+"','"+owrate+"','"+owvalue+"','"+cquantity+"','"+cunit+"','"+crate+"','"+cvalue+"')";
             int x=st.executeUpdate(query);
            
            if(x>0)
                flag=true;
            else
                flag=false;
          

        }

        catch(Exception e)
        {
            System.out.println("Exeption in StockDBOperation Class is: "+e);
            flag=false;
        }




        return flag;
    }
    
    public ArrayList getAllStockinfo()
    {

       ArrayList stockinfo=new ArrayList();
       int i=0;

        try
        {

             Statement st= new DBDriver().getStatment();
              String query="Select *from stockinfo";
              ResultSet rs1=st.executeQuery(query);
             
             while(rs1.next())
            {

             ArrayList temp=new ArrayList();   
             String iname=rs1.getString(1);
             String hsncode=rs1.getString(2);
             String oquan=rs1.getString(3);
             String ounit=rs1.getString(4);
             String orate=rs1.getString(5);
             String ova=rs1.getString(6);
             String iquan=rs1.getString(7);
             String iunit=rs1.getString(8);
             String irate=rs1.getString(9);
             String iva=rs1.getString(10);
             String owquan=rs1.getString(11);
             String owunit=rs1.getString(12);
             String owrate=rs1.getString(13);
             String owva=rs1.getString(14);
             String cquan=rs1.getString(15);
             String cunit=rs1.getString(16);
             String crate=rs1.getString(17);
             String cva=rs1.getString(18);
             
            
             temp.add(Integer.toString(i+1));
             temp.add(iname);
             temp.add(hsncode);
             temp.add(oquan);
             temp.add(ounit);
             temp.add(orate);
             temp.add(ova);
             temp.add(iquan);
             temp.add(iunit);
             temp.add(irate);
             temp.add(iva);
             temp.add(owquan);
             temp.add(owunit);
             temp.add(owrate);
             temp.add(owva);
             temp.add(cquan);
             temp.add(cunit);
             temp.add(crate);
             temp.add(cva);
             stockinfo.add(temp);
             i++;

            }
             
        }

        catch(Exception e)
        {
            System.out.println("Exeption in StockDBOperation Class is: "+e);

        }

       return stockinfo;
    }    
    
    
    
    
}
