package idv.jk.hf.ooad.guitarinventory;

/**
 * Created by bioyang on 2016/1/4.
 */
public class MandolinSpec extends InstrumentSpec {
    private Style style;

    public MandolinSpec(Builder builder, String model, Type type, Style style, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if (!(otherSpec instanceof MandolinSpec)) {
            return false;
        }

        if (!super.matches(otherSpec)) {
            return false;
        }

        MandolinSpec mandolinSpec = (MandolinSpec)otherSpec;

        if (mandolinSpec.style != this.style) {
            return false;
        }
        return true;
    }

    public Style getStyle() {
        return style;
    }
}
