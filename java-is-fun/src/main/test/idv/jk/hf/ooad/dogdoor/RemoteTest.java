package idv.jk.hf.ooad.dogdoor;

import org.junit.Before;
import org.junit.Test;
//import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
//import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by bioyang on 2015/12/21.
 */
//@RunWith(MockitoJUnitRunner.class)
public class RemoteTest {
    private Remote remote;
    //@Mock
    private DogDoor dogDoor;
    @Before
    public void setup(){
        //this.dogDoor = mock(DogDoor.class);
        this.dogDoor = new DogDoor();
        this.remote = new Remote(this.dogDoor);
    }
    @Test
    public void testPressButton(){
        this.remote.pressButton();
        assertTrue(this.dogDoor.isOpen());
        this.remote.pressButton();
        assertFalse(this.dogDoor.isOpen());
    }
}
