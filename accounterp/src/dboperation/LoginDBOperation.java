package dboperation;

import dbdriver.DBDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDBOperation {

    public boolean checkManagerLogin(String uname, String pass) {
        boolean flag = true;

        try {

            Statement st = new DBDriver().getStatment();
            String query = "Select * from managerinfo where Username='" + uname + "'and Password='" + pass + "'";
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                flag = true;
            }

            else {
                flag = false;
            }

            st.close();
        }

        catch (Exception e) {
            System.out.println("Exception in LoginDBOperation Class in checkManagerLogin method() is: " + e);
            flag = false;
        }

        return flag;
    }

    public boolean checkCEOLogin(String uname, String pass) {
        boolean flag = true;

        try {

            Statement st = new DBDriver().getStatment();
            String query = "Select * from ceoinfo where Username='" + uname + "'and Password='" + pass + "'";
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                flag = true;
            }

            else {
                flag = false;
            }

            st.close();
        }

        catch (Exception e) {
            System.out.println("Exception in LoginDBOperation Class in checkCEOLogin method() is: " + e);
            flag = false;
        }

        return flag;
    }

    public boolean checkStaffLogin(String uname, String pass) {
        boolean flag = true;

        try {

            Statement st = new DBDriver().getStatment();
            String query = "Select * from newstaffinfo where Username='" + uname + "'and Password='" + pass + "'";
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                flag = true;
            }

            else {
                flag = false;
            }

            st.close();
        }

        catch (Exception e) {
            System.out.println("Exception in LoginDBOperation Class in checkStaffLogin method() is: " + e);
            flag = false;
        }

        return flag;
    }

}
