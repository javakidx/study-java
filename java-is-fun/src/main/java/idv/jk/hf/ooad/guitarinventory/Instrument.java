package idv.jk.hf.ooad.guitarinventory;

/**
 * Created by bioyang on 2016/1/4.
 */
public abstract class Instrument {
    protected InstrumentSpec spec;
    protected String serialNumber;
    protected double price;

    public Instrument(String serialNumber, double price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InstrumentSpec getSpec() {
        return spec;
    }
}
