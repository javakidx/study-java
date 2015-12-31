package idv.jk.hf.ooad.dogdoor;

/**
 * Created by bioyang on 2015/12/27.
 */
public class Bark {
    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }

    @Override
    public boolean equals(Object bark) {
        if (bark instanceof Bark) {
            Bark otherBark = (Bark)bark;

            return otherBark.sound.equalsIgnoreCase(this.sound);
        }
        return false;
    }
}
