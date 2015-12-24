package idv.jk.hf.ooad.dogdoor;

//import java.util.Timer;
//import java.util.TimerTask;

/**
 * Created by bioyang on 2015/12/21.
 */
public class Remote {
    private DogDoor dogDoor;

    public Remote(DogDoor dogDoor){
        this.dogDoor = dogDoor;
    }

    public void pressButton(){
        System.out.println("Pressing the remote control button");

        if(dogDoor.isOpen()){
            dogDoor.close();
        }else{
            dogDoor.open();

//            Encapsulated in DogDoor
//            final Timer timer = new Timer();
//            timer.schedule(new TimerTask() {
//                @Override
//                public void run() {
//                    dogDoor.close();
//                    timer.cancel();
//                }
//            }, 5000);
        }
    }
}
