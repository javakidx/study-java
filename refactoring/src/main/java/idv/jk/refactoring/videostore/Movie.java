package idv.jk.refactoring.videostore;

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	public Movie(String title, int priceCode){
		this.title = title;
		this.priceCode = priceCode;
	}
	private String title;
	private int priceCode;
	
	public String getTitle() {
		return title;
	}
	
	public int getPriceCode() {
		return priceCode;
	}
	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}
	
	public double getCharge(int rentedDays) {
		double result = 0;

		switch (getPriceCode()) {
			case Movie.REGULAR:
				result += 2;
				if (rentedDays > 2) {
					result += (rentedDays - 2) * 1.5;
				}
				break;
			case Movie.NEW_RELEASE:
				result += rentedDays * 3;
				break;
			case Movie.CHILDRENS:
				result += 1.5;
				if (rentedDays > 3) {
					result += (rentedDays - 3) * 1.5;
				}
				break;
		}
		return result;
	}

	public int getFrequentRenterPoints(int rentedDays) {
		if (getPriceCode() == Movie.NEW_RELEASE && rentedDays > 1) {
			return 2;
		}
		return 1;
	}
}
