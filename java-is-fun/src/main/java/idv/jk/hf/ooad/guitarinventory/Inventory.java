package idv.jk.hf.ooad.guitarinventory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bioyang on 2016/1/4.
 */
public class Inventory {
    private List<Instrument> instrumentList = new ArrayList<>();

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {

    }

    public Guitar get(String serialNumber) {
        return null;
    }

    public List<Guitar> search(GuitarSpec spce) {
        return null;
    }

    public List<Mandolin> search(MandolinSpec spec) {
        return null;
    }
}
