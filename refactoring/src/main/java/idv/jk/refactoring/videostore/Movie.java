package idv.jk.refactoring.videostore;

public class Movie {
	public static final int CHILDREN = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String title;
	private Price price;

	public Movie(String title, int priceCode){
		this.title = title;
		setPriceCode(priceCode);
	}

	public String getTitle() {
		return title;
	}
	
	public int getPriceCode() {
		return price.getPriceCode();
	}
	public void setPriceCode(int priceCode) {
		switch (priceCode) {
			case REGULAR:
				this.price = new RegularPrice();
				break;
			case CHILDREN:
				this.price = new ChildrenPrice();
				break;
			case NEW_RELEASE:
				this.price = new NewReleasePrice();
				break;
			default:
				throw new IllegalArgumentException("Incorrect Price Code");
		}
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
			case Movie.CHILDREN:
				result += 1.5;
				if (rentedDays > 3) {
					result += (rentedDays - 3) * 1.5;
				}
				break;
		}
		return result;
	}

	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}
}
