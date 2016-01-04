package idv.jk.hf.ooad.guitarinventory;

/**
 * Created by bioyang on 2016/1/5.
 */
public abstract class InstrumentSpec {
    protected String model;
    protected Builder builder;
    protected Type type;
    protected Wood topWood;
    protected Wood backWood;

    public abstract boolean matches(InstrumentSpec spec);

    public String getModel() {
        return model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public Wood getBackWood() {
        return backWood;
    }
}
