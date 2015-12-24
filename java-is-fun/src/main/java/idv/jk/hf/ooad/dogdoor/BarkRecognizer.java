package idv.jk.hf.ooad.dogdoor;

/**
 * Created by bioyang on 2015/12/24.
 */
public class BarkRecognizer {
    private DogDoor dogDoor;

    public BarkRecognizer(DogDoor dogDoor){
        this.dogDoor = dogDoor;
    }

    public void recognize(String bark){
        System.out.println("    BackRecognizer: Heard a '" + bark + "'");
        this.dogDoor.open();
    }
}
