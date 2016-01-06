package idv.jk.hf.ooad.guitarinventory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bioyang on 2016/1/4.
 */
public class Inventory {
    private List<Instrument> instrumentList = new ArrayList<>();

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;

        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);
        } else if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, (MandolinSpec)spec);
        }

        instrumentList.add(instrument);
    }

    public Instrument get(String serialNumber) {
        for (Instrument instrument : this.instrumentList) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public Guitar getGuitar(String serialNumber) {
        for (Instrument instrument : this.instrumentList) {
            Guitar guitar = (Guitar)instrument;
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Mandolin> search(MandolinSpec spec) {
        List<Mandolin> matchingMandolins = new ArrayList<>();

        for (Instrument instrument : this.instrumentList) {
            Mandolin mandolin = (Mandolin)instrument;

            if (mandolin.getSpec().matches(spec)) {
                matchingMandolins.add(mandolin);
            }
        }

        return matchingMandolins;
    }
}
