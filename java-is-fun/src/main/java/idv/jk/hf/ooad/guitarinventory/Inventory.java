package idv.jk.hf.ooad.guitarinventory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bioyang on 2016/1/4.
 */
public class Inventory {
    private List<Instrument> inventory = new ArrayList<>();

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber, price, spec);

//        if (spec instanceof GuitarSpec) {
//            instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);
//        } else if (spec instanceof MandolinSpec) {
//            instrument = new Mandolin(serialNumber, price, (MandolinSpec)spec);
//        }

        inventory.add(instrument);
    }

    public Instrument get(String serialNumber) {
        for (Instrument instrument : this.inventory) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public Guitar getGuitar(String serialNumber) {
        for (Instrument instrument : this.inventory) {
            Guitar guitar = (Guitar)instrument;
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Instrument> search(InstrumentSpec spec) {
        List<Instrument> matchingInstruments = new ArrayList<>();

        for (Instrument Instrument : this.inventory) {
            if (Instrument.getSpec().matches(spec)) {
                matchingInstruments.add(Instrument);
            }
        }

        return matchingInstruments;
    }
}
