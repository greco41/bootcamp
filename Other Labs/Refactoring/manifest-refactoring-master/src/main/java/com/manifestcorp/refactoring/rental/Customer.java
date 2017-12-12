package com.manifestcorp.refactoring.rental;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals;

    public Customer(String customerName) {
        rentals = new ArrayList<Rental>();
        name = customerName;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental result for " + getName() + ".\n";

        for (Rental rental : getRentals()) {
            
            double thisAmount = addAmount(rental);

            // Add a frequent renter point for each rental
            frequentRenterPoints = addFrequentRenterPoints(frequentRenterPoints, rental);

            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        return result = resultString(result, totalAmount, frequentRenterPoints);
    }
    
    public double addAmount(Rental rental) {
    	double currentRentalAmount = 0;
    	switch(rental.getMovie().getPriceCode()) {
        case Movie.REGULAR:
            currentRentalAmount += 2;
            if (rental.getDaysRented() > 2) {
                return currentRentalAmount += (rental.getDaysRented() -2) * 1.5;
            }
            break;
        case Movie.NEW_RELEASE:
            return currentRentalAmount += rental.getDaysRented() * 3;
        case Movie.CHILDRENS:
            currentRentalAmount += 1.5;
            if (rental.getDaysRented() > 3) {
                return currentRentalAmount += (rental.getDaysRented() - 3) * 1.5;
            }
            break;
    	}
    	return currentRentalAmount;
    }
    
    public int addFrequentRenterPoints(int frequentRenterPoints, Rental rental) {
    	frequentRenterPoints++;
        if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
            rental.getDaysRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
    
    public String resultString(String result, double totalAmount, int frequentRenterPoints) {
    	result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points.";
        return result;
    }


}
