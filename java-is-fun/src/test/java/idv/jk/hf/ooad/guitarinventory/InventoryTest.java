package idv.jk.hf.ooad.guitarinventory;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by bioyang on 2016/1/12.
 */
public class InventoryTest {
    @Test
    public void testFindInstrument() {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map<String, Object> properties = new HashMap<>();
        properties.put("builder", Builder.GIBSON);
        properties.put("backWood", Wood.MAPLE);

        InstrumentSpec clientSpec = new InstrumentSpec(properties);

        List<Instrument> matchingInstruments = inventory.search(clientSpec);
        assertFalse(matchingInstruments.isEmpty());

        if (!matchingInstruments.isEmpty()) {
            //Just for printout
            System.out.println("You might like these instruments:");

            for (Instrument instrument : matchingInstruments) {
                InstrumentSpec spec = instrument.getSpec();

                System.out.println("We have a " + spec.getProperty("instrumentType") + " with the following properties:");

                for (String propertyName : instrument.getSpec().getProperties().keySet()) {
                    if (properties.equals("instrumentType")) {
                        continue;
                    }
                    System.out.println("    " + propertyName + ": " + spec.getProperty(propertyName));
                }

                System.out.println("    You can have this " + spec.getProperty("instrumentType") + " for $" + instrument.getPrice() + "\n---");
            }
        } else {
            System.out.println("Sorry, we have notthing for you.");
        }
    }

    private void initializeInventory(Inventory inventory) {

    }
}
