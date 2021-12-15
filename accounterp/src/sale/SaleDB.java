
package sale;

import dbdriver.DBDriver;
import java.sql.ResultSet;
import java.sql.Statement;

public class SaleDB

{

    public boolean isInvoiceExisted(String inv) {
        boolean flag = false;
        try {
            Statement st = new DBDriver().getStatment();
            String query = "Select * from saleinfo where Invoice_Number='" + inv + "' ";
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                flag = true;
            }
            st.close();
        } catch (Exception e) {
            System.out.println("Exception in SaleDB class and method isInvoiceExisted(): " + e);
            flag = false;
        }
        return flag;
    }

}
