package idv.jk.refactoring.videostore;

/**
 * Created by bioyang on 2016/1/5.
 */
public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
