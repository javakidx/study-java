package idv.jk.hf.ooad.guitarinventory;

/**
 * Created by bioyang on 2015/11/19.
 */
public enum Type {
    ACOUSTIC, ELECTRIC;

    public String toString() {
        switch(this) {
            case ACOUSTIC: return "acoustic";
            case ELECTRIC: return "electric";
            default:       return "unspecified";
        }
    }
}
