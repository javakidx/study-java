package idv.jk.refactoring.videostore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by bioyang on 2015/12/31.
 */
public class CustomerTest {
    private final String EXPECTED_RESULT_OF_STATEMENT = "Rental Record for Mary\n" +
            "\tDH4\t9.0\n" +
            "Amount owed is 9.0\n" +
            "You earned 2 frequent renter points";
    @Test
    public void testStatement() {
        Movie newMovie = new Movie("DH4", Movie.NEW_RELEASE);
        Rental rental = new Rental(newMovie, 3);

        Customer mary = new Customer("Mary");
        mary.addRental(rental);

        String exactResult = mary.statement();
        assertNotNull(exactResult);
        assertEquals(EXPECTED_RESULT_OF_STATEMENT, exactResult);
    }

}
