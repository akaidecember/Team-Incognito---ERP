package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.*;

public class CurrentDate {
  public String getDate() {
    Calendar cal = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    String p = dateFormat.format(cal.getTime());
    return p;
  }
}