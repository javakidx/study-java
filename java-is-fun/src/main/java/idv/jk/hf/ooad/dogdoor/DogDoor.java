package idv.jk.hf.ooad.dogdoor;

import java.util.List;
import java.util.LinkedList;
import java.util.Timer;

/**
 * Created by bioyang on 2015/12/21.
 */
public class DogDoor {
    private boolean open;

    public DogDoor(){
        this.open = false;
    }

    public void open(){
        System.out.println("The dog door opens.");
        this.open = true;
    }

    public void close(){
        System.out.println("The dog door closes.");
        this.open = false;
    }

    public boolean isOpen(){
        return this.open;
    }
}
