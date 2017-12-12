package com.manifestcorp.refactoring.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProcessor {

    public void saveDueDate(Account account, String date) {
        account.setDueDate(parseDateString(date));
    }

    public void saveStartDate(Account account, String date) {
        account.setStartDate(parseDateString(date));
    }
    
    public Date parseDateString(String date) {
    	Date parsedDate = null;
        try {
            return parsedDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parsedDate;
    }


}
