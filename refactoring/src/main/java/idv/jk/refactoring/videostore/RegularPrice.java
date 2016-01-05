package idv.jk.refactoring.videostore;

/**
 * Created by bioyang on 2016/1/5.
 */
public class RegularPrice extends Price{
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }
}
