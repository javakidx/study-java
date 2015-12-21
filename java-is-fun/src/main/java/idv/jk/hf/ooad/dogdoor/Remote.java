package idv.jk.hf.ooad.dogdoor;

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
        }
    }
}
