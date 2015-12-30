package idv.jk.hf.ooad.dogdoor;

import org.junit.Test;

/**
 * Created by bioyang on 2015/12/24.
 */
public class DogDoorSimulator {
    @Test
    public void testDogDoorFunction() {
        DogDoor dogDoor = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(dogDoor);
        Remote remote = new Remote(dogDoor);

        System.out.println("Fido starts barking.");
        recognizer.recognize("Woof");

        System.out.println("\nFido has gone outside...");

        System.out.println("\nFido's all done...");

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e) {

        }

        System.out.println("...but he's stuck outside!");

        System.out.println("Fido starts barking.");
        recognizer.recognize("Woof");

        System.out.println("\nFido's back inside...");
    }
}
