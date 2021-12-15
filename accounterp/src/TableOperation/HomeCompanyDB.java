
package TableOperation;

import dbdriver.DBDriver;
import java.sql.ResultSet;
import java.sql.Statement;

public class HomeCompanyDB {
    public boolean isHomeCompanyAdded() {
        boolean flag = false;

        try {

            Statement st = new DBDriver().getStatment();
            String query = "Select * from homecompanyinfo ";
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                flag = true;
            }

            st.close();
        }

        catch (Exception e) {
            System.out.println("Exeption in isHomeCompanyAdded() of OperationFrame: " + e);
            flag = false;
        }

        return flag;
    }
}
