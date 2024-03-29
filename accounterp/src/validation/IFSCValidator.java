
package validation;

public class IFSCValidator {
    public String isValidIFSC(String str) {
        String result = "";
        if (str.isEmpty()) {
            result = "IFSC number can not be empty \n Please Enter it";
        } else {
            if (str.length() != 11) {
                result = "IFSC Number should be of 11 Characters";
            } else {
                if (!isAlphaNumeric(str))
                    result = "IFSC Number should Contain only Alpha Numeric Characters";
            }

        }

        return result;
    }

    public boolean isAlphaNumeric(String str) {
        boolean flag = true;

        int count1 = 0, count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int x = (int) ch;
            if (x >= 65 && x <= 90) {
                count1++;

            } else if (x >= 48 && x <= 57) {
                count2++;
            }
        }

        if (count1 != 0 && count2 != 0) {
            int sum = count1 + count2;
            if (sum != 11)
                flag = false;

        } else {
            flag = false;
        }

        return flag;
    }
}
