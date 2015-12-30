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
}
