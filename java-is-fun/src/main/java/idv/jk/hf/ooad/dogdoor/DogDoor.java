package idv.jk.hf.ooad.dogdoor;

import java.util.Timer;
import java.util.TimerTask;

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

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close(){
        System.out.println("The dog door closes.");
        this.open = false;
    }

    public boolean isOpen(){
        return this.open;
    }
}
