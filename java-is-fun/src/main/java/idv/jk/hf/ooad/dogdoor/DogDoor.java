package idv.jk.hf.ooad.dogdoor;

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