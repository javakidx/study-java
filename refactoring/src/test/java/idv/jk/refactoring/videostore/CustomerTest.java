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
            "\tShaun the Sheep\t4.5\n" +
            "Amount owed is 13.5\n" +
            "You earned 3 frequent renter points";
    @Test
    public void testStatement() {
        Movie newMovie = new Movie("DH4", Movie.NEW_RELEASE);
        Movie childMovie = new Movie("Shaun the Sheep", Movie.CHILDREN);
        Rental rental = new Rental(newMovie, 3);
        Rental rental1 = new Rental(childMovie, 5);

        Customer mary = new Customer("Mary");
        mary.addRental(rental);
        mary.addRental(rental1);

        String exactResult = mary.statement();
        //System.out.println(exactResult);
        //assertNotNull(exactResult);
        assertEquals(EXPECTED_RESULT_OF_STATEMENT, exactResult);
    }

}
