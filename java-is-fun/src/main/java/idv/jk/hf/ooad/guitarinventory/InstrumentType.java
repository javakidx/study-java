package idv.jk.hf.ooad.guitarinventory;

/**
 * Created by bioyang on 2016/1/12.
 */
public enum InstrumentType {
    GUITAR, BANJO, DOBRO, FIDDLE, BASS, MANDOLIN;

    @Override
    public String toString() {
        switch (this) {
            case GUITAR:
                return "Guitar";
            case BANJO:
                return "Banjo";
            case DOBRO:
                return "Dobro";
            case FIDDLE:
                return "Fiddle";
            case BASS:
                return "Bass";
            case MANDOLIN:
                return "Mandolin";
            default:
                return "Unspecified";
        }
    }

}
