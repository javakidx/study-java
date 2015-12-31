package idv.jk.hf.ooad.dogdoor;

import java.util.List;

/**
 * Created by bioyang on 2015/12/24.
 */
public class BarkRecognizer {
    private DogDoor dogDoor;

    public BarkRecognizer(DogDoor dogDoor){
        this.dogDoor = dogDoor;
    }

    public void recognize(Bark bark){
        System.out.println("    BackRecognizer: Heard a '" + bark.getSound() + "'");

        List<Bark> allowedBarks = dogDoor.getAllowedBarks();
        for (Bark allowedBark : allowedBarks) {
            if (allowedBark.equals(bark)) {
                this.dogDoor.open();
                return;
            }
        }
        System.out.println("This dog is not allowed");
    }
}
