package idv.jk.hf.ooad.dogdoor;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by bioyang on 2015/12/21.
 */
@RunWith(MockitoJUnitRunner.class)
public class RemoteTest {
    private Remote remote;
    @Mock
    private DogDoor dogDoor;
    @Before
    public void setup(){

    }

    @Test
    public void testPressButton(){
        DogDoor dogDoor = new DogDoor();
        this.remote = new Remote(dogDoor);
        this.remote.pressButton();
        assertTrue(dogDoor.isOpen());
        this.remote.pressButton();
        assertFalse(dogDoor.isOpen());
    }

    @Test
    public void testDogDoorOpen(){
        when(this.dogDoor.isOpen()).thenReturn(false);
        assertFalse(this.dogDoor.isOpen());
        when(this.dogDoor.isOpen()).thenReturn(true);
        assertTrue(this.dogDoor.isOpen());
    }
}
