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
		//double totalAmount = 0; replace temp with query
		//int frequentRenterPoints = 0; replace temp with query

		String result  = "Rental Record for " + getName() + "\n";
		for (Rental rental : rentalList) {
			/*1st
			double thisAmount = 0;

			switch (rental.getMovie().getPriceCode()) {
				case Movie.REGULAR:
					thisAmount += 2;
					if (rental.getDaysRented() > 2) {
						thisAmount += (rental.getDaysRented() - 2) * 1.5;
					}
					break;
				case Movie.NEW_RELEASE:
					thisAmount += rental.getDaysRented() * 3;
					break;
				case Movie.CHILDRENS:
					thisAmount += 1.5;
					if (rental.getDaysRented() > 3) {
						thisAmount += (rental.getDaysRented() - 3) * 1.5;
					}
					break;
			}*/
			//3rd double thisAmount = amountFor(rental);	//1st
			//reduce temp variable ↓
			//double thisAmount = rental.getCharge(); //3rd
			//add frequent renter points
			//frequentRenterPoints++;	//extract the method to calculate frequent points
			//frequentRenterPoints += rental.getFrequentRenterPoints(); replace temp with query
			//add bonus for a two day new release rental
			//if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE && rental.getDaysRented() > 1) {//extract the method to calculate frequent points
			//	frequentRenterPoints++;
			//}
			//show figures for this rental
			result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()/*thisAmount*/) + "\n";
			//totalAmount += rental.getCharge();//thisAmount; remove temp variable again
		}
		//add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()/*totalAmount*/) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()/*frequentRenterPoints*/) + " frequent renter points";
		//System.out.println(result);
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
	//1st added

	//3rd private double amountFor(Rental rental) {
	//3rd 	return rental.getCharge(); //2nd
		/* 2nd
		double result = 0;

		switch (rental.getMovie().getPriceCode()) {
			case Movie.REGULAR:
				result += 2;
				if (rental.getDaysRented() > 2) {
					result += (rental.getDaysRented() - 2) * 1.5;
				}
				break;
			case Movie.NEW_RELEASE:
				result += rental.getDaysRented() * 3;
				break;
			case Movie.CHILDRENS:
				result += 1.5;
				if (rental.getDaysRented() > 3) {
					result += (rental.getDaysRented() - 3) * 1.5;
				}
				break;
		}
		return result;*/
	//3rd }
}
