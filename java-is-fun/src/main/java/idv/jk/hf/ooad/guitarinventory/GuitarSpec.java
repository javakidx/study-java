package idv.jk.hf.ooad.guitarinventory;

/**
 * Created by bioyang on 2015/12/21.
 */
public class GuitarSpec extends InstrumentSpec{
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if (!(otherSpec instanceof GuitarSpec)) {
            return false;
        }

        if (!super.matches(otherSpec)) {
            return false;
        }

        GuitarSpec guitarSpec = (GuitarSpec) otherSpec;
        if (guitarSpec.numStrings != this.numStrings) {
            return false;
        }

        return true;
    }
}
