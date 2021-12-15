
package dboperation;

import dbdriver.DBDriver;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

public class HomeCompanyDBOperation {

    public boolean addHomeCompanyInfo(String name, String add, String city, String pin, String state, String mob,
            String email, String fdetails, String nbusine, String ptype, String rnum, String pan, String gst,
            String gstscode, String bankdetails, String loginby, String logindate, String logoname, String path1,
            String signaturename, String path2) {
        boolean flag = true;

        try {

            Connection conn = new DBDriver().getConnection();
            PreparedStatement ps = conn
                    .prepareStatement("insert into homecompanyinfo values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1, name);
            ps.setString(2, add);
            ps.setString(3, city);
            ps.setString(4, pin);
            ps.setString(5, state);

            ps.setString(6, mob);
            ps.setString(7, email);
            ps.setString(8, fdetails);
            ps.setString(9, nbusine);
            ps.setString(10, ptype);

            ps.setString(11, rnum);
            ps.setString(12, pan);
            ps.setString(13, gst);
            ps.setString(14, gstscode);
            ps.setString(15, bankdetails);

            ps.setString(16, loginby);
            ps.setString(17, logindate);

            ps.setString(18, logoname);

            if (path1 == null) {
                String str = "logoimage";
                byte[] content = str.getBytes();
                Blob blob = ps.getConnection().createBlob();
                blob.setBytes(1, content);
                ps.setBlob(19, blob);
            } else {
                FileInputStream fis = new FileInputStream(path1);
                ps.setBinaryStream(19, fis, fis.available());
            }

            ps.setString(20, signaturename);

            if (path2 == null) {
                String str = "signatureimage";
                byte[] content = str.getBytes();
                Blob blob = ps.getConnection().createBlob();
                blob.setBytes(1, content);
                ps.setBlob(21, blob);
            } else {
                FileInputStream fis = new FileInputStream(path2);
                ps.setBinaryStream(21, fis, fis.available());
            }

            int x = ps.executeUpdate();

            if (x > 0)
                flag = true;
            else
                flag = false;

            ps.close();

        }

        catch (Exception e) {
            System.out.println("Exeption in HomeCompanyDBOperation Class is in addHomeCompanyInfo(): " + e);
            flag = false;
        }

        return flag;
    }

    public ArrayList getAllHomeCompanyName() {

        ArrayList hcname = new ArrayList();

        try {

            Statement st = new DBDriver().getStatment();
            String query = "Select *from homecompanyinfo";
            ResultSet rs1 = st.executeQuery(query);

            while (rs1.next()) {

                String name = rs1.getString(1);
                hcname.add(name);

            }
            st.close();

        }

        catch (Exception e) {
            System.out.println("Exeption in HomeCompanyDBOperation Class is in getAllHomeCompanyName(): " + e);

        }

        return hcname;
    }

    public ArrayList getHomeCompanyInfo() {

        ArrayList hcinfo = new ArrayList();

        try {

            Statement st = new DBDriver().getStatment();
            String query = "Select *from homecompanyinfo";
            ResultSet rs1 = st.executeQuery(query);

            while (rs1.next()) {

                String address = rs1.getString(2);
                String city = rs1.getString(3);
                String pin = rs1.getString(4);
                String state = rs1.getString(5);
                String mob = rs1.getString(6);
                String email = rs1.getString(7);
                String fdetails = rs1.getString(8);
                String nbusiness = rs1.getString(9);
                String ptype = rs1.getString(10);
                String rnum = rs1.getString(11);
                String pan = rs1.getString(12);
                String gst = rs1.getString(13);
                String gstscode = rs1.getString(14);
                String bankdetails = rs1.getString(15);
                String costcenter = "";
                String name = rs1.getString(1);

                hcinfo.add(address);
                hcinfo.add(city);
                hcinfo.add(pin);
                hcinfo.add(state);
                hcinfo.add(mob);
                hcinfo.add(email);
                hcinfo.add(fdetails);
                hcinfo.add(nbusiness);
                hcinfo.add(ptype);
                hcinfo.add(rnum);
                hcinfo.add(pan);
                hcinfo.add(gst);
                hcinfo.add(gstscode);
                hcinfo.add(bankdetails);
                hcinfo.add(costcenter);
                hcinfo.add(name);
                hcinfo.add(rs1.getString(19));
                Blob b1 = rs1.getBlob("logoimage");
                byte barr1[] = b1.getBytes(1, (int) b1.length());
                hcinfo.add(barr1);
                hcinfo.add(rs1.getString(21));
                Blob b2 = rs1.getBlob("signimage");
                byte barr2[] = b2.getBytes(1, (int) b2.length());
                hcinfo.add(barr2);
            }
            st.close();

        }

        catch (Exception e) {
            System.out.println("Exeption in HomeCompanyDBOperation Class is in getHomeCompanyInfo(): " + e);

        }

        return hcinfo;
    }

    public boolean updateHomeCompanyinfo(String name, String add, String city, String pin, String state, String mob,
            String email, String fdetails, String nbusine, String ptype, String rnum, String pan, String gst,
            String gstscode, String bankdetails, String loginby, String logindate, byte f1[], FileInputStream fis1,
            byte f2[], FileInputStream fis2) {
        boolean flag = true;

        try {
            Connection conn = new DBDriver().getConnection();
            PreparedStatement ps = conn.prepareStatement("Update homecompanyinfo set "
                    + " Address = ?,City = ?,Pin = ? , State = ? , Contact_Number= ? ,"
                    + " Email_Id = ? , Formation_Details = ?, Nature_of_Business =? , Party_Type =? ,"
                    + " Registration_Number = ?,PAN_Number=?,GSTIN=? ,"
                    + "GST_State_Code=?,Bank_Details=?,"
                    + "Login_By=?,Login_Date=?,"
                    + "logoname = ?,logoimage = ? ,signaturename = ?, signimage = ? where Name = ? ");

            // ? ");

            ps.setString(1, add);
            ps.setString(2, city);
            ps.setString(3, pin);
            ps.setString(4, state);
            ps.setString(5, mob);
            ps.setString(6, email);
            ps.setString(7, fdetails);
            ps.setString(8, nbusine);
            ps.setString(9, ptype);
            ps.setString(10, rnum);
            ps.setString(11, pan);
            ps.setString(12, gst);
            ps.setString(13, gstscode);
            ps.setString(14, bankdetails);
            ps.setString(15, loginby);
            ps.setString(16, logindate);
            ps.setString(17, "logoimage");

            if (fis1 == null) {
                if (f1.length > 9) {

                    InputStream is = null;
                    is = new ByteArrayInputStream(f1);
                    ps.setBinaryStream(18, is, is.available());
                    System.out.println("Old image1 inserted ");
                } else {

                    Blob blob = ps.getConnection().createBlob();
                    blob.setBytes(1, f1);
                    ps.setBlob(18, blob);
                    System.out.println("NO image1  inserted ");
                }

            } else {
                ps.setBinaryStream(18, fis1, fis1.available());

                System.out.println("New image1 inserted ");
            }

            ps.setString(19, "signatureimage");

            if (fis2 == null) {
                if (f2.length > 14) {

                    InputStream is = null;
                    is = new ByteArrayInputStream(f2);
                    // byte []b=new byte
                    // is.read(f1);
                    ps.setBinaryStream(20, is, is.available());
                    System.out.println("Old image2 inserted ");
                } else {

                    Blob blob = ps.getConnection().createBlob();
                    blob.setBytes(1, f2);
                    ps.setBlob(20, blob);
                    System.out.println("NO image2  inserted ");
                }

            } else {
                ps.setBinaryStream(20, fis2, fis2.available());
                System.out.println("New image2 inserted ");

            }

            ps.setString(21, name);

            int x = ps.executeUpdate();

            if (x > 0)
                flag = true;
            else
                flag = false;

            ps.close();
        } catch (Exception ex) {
            System.out.println("Exeption in HomeCompanyDBOperation Class is in updateHomeCompanyinfo(): " + ex);

            ex.printStackTrace();
            flag = false;
        }

        return flag;
    }

}
