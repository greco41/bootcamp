package com.manifestcorp.refactoring.stringbuilder;

public class StringBuilder {

    public String printOwingAndInvoiceOpeningStatement(double amount) {
        String result = starLineString(" ************ ", " Your Invoice ")+"\n";
        result += appendToStarString("  Amount Owed    ");
        result += "*** You owe $" + String.valueOf(amount) + " ***\n";
        return result;
    }

    public String printRefund(double refundAmount) {
        String result = appendToStarString("  Amount Refunded");
        result += "*** Your refund is $" + String.valueOf(refundAmount) + " ***\n";
        return result;
    }

    public String printInvoiceClosingStatement(String customerName) {
        String result = starLineString(" ", " ");
        result += "*** Thank you, " + customerName + "   ***\n";
        result += starLineString(" ************ ", " ************ ");

        return result;
    }

    public String printFullInvoice(double amountOwed, double refundAmount, String customerName) {
        String result = printOwingAndInvoiceOpeningStatement(amountOwed);
        result += printRefund(refundAmount);
        result += printInvoiceClosingStatement(customerName);
        return result;
    }
    
    public String appendToStarString(String appendedString) {
    	String starString = "";
    	starString += "************ ************\n";
    	starString += "*** "+appendedString+" ***\n";
        starString += "************ ************\n";
        starString += "\n\n\n";
    	return starString;
    }
    
    public String starLineString(String appendedString1, String appendedString2) {
    	String starString = "";
    	starString += "************"+appendedString1+"************\n";
        starString += "************"+appendedString2+"************\n";
    	return starString;
    }
}
