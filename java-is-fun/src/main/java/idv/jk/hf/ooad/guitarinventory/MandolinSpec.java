package idv.jk.hf.ooad.guitarinventory;

/**
 * Created by bioyang on 2016/1/4.
 */
public class MandolinSpec extends InstrumentSpec {
    private Style style;

    @Override
    public boolean matches(InstrumentSpec spec) {
        return false;
    }

    public Style getStyle() {
        return style;
    }
}
