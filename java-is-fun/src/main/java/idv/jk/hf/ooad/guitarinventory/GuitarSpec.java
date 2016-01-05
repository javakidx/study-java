package idv.jk.hf.ooad.guitarinventory;

/**
 * Created by bioyang on 2015/12/21.
 */
public class GuitarSpec extends InstrumentSpec{
    private int numStrings;

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec spec) {
        return false;
    }
//    private String model;
//    private int numStrings;
//
//    private Builder builder;
//    private Type type;
//    private Wood topWood;
//    private Wood backWood;
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getNumStrings() {
//        return numStrings;
//    }
//
//    public void setNumStrings(int numStrings) {
//        this.numStrings = numStrings;
//    }
//
//    public Builder getBuilder() {
//        return builder;
//    }
//
//    public void setBuilder(Builder builder) {
//        this.builder = builder;
//    }
//
//    public Type getType() {
//        return type;
//    }
//
//    public void setType(Type type) {
//        this.type = type;
//    }
//
//    public Wood getTopWood() {
//        return topWood;
//    }
//
//    public void setTopWood(Wood topWood) {
//        this.topWood = topWood;
//    }
//
//    public Wood getBackWood() {
//        return backWood;
//    }
//
//    public void setBackWood(Wood backWood) {
//        this.backWood = backWood;
//    }


}
