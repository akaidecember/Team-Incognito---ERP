
package purchase;

import dbdriver.DBDriver;
import java.sql.ResultSet;
import java.sql.Statement;

public class PurchaseDB

{

    public boolean isInvoiceExisted(String inv) {
        boolean flag = false;
        try {
            Statement st = new DBDriver().getStatment();
            String query = "Select * from purchaseinfo where Invoice_Number='" + inv + "' ";
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                flag = true;
            }
            st.close();
        } catch (Exception e) {
            System.out.println("Exeption in PartyDB class and method isPartyExisted(): " + e);
            flag = false;
        }
        return flag;
    }

}
