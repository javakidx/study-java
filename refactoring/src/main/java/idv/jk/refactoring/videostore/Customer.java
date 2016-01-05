package idv.jk.refactoring.videostore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentalList = new ArrayList<>();
	
	public Customer(String name){
		this.name = name;
	}
	
	public void addRental(Rental rental) {
		this.rentalList.add(rental);
	}
	
	public String getName() {
		return this.name;
	}

	public String statement() {

		String result  = "Rental Record for " + getName() + "\n";
		for (Rental rental : rentalList) {
			result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()/*thisAmount*/) + "\n";
		}
		//add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()/*totalAmount*/) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()/*frequentRenterPoints*/) + " frequent renter points";
		return result;
	}

	public String htmlStatement() {
		String result = "<h1>Rentals for <em>" + getName() + "</em></h1><p>\n";

		for (Rental rental : this.rentalList) {
			result += rental.getMovie().getTitle() + ": " + String.valueOf(rental.getCharge()) + "<br>\n";
		}
		//add footer lines
		result += "<p>You owe <em>" + String.valueOf(getTotalCharge()) + "</em><p>\n";
		result += "On this rental you earned <em>" + String.valueOf(getTotalFrequentRenterPoints()) + "</em> frequent renter points<p>";

		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		for (Rental rental : this.rentalList) {
			result += rental.getCharge();
		}
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int points = 0;

		for (Rental rental : this.rentalList) {
			points += rental.getFrequentRenterPoints();
		}

		return points;
	}
}
