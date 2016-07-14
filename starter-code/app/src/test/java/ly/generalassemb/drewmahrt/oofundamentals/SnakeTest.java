package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by andeski on 7/13/16.
 */
public class SnakeTest {


    @Test
    public void getSnakeSound() {
        Animal temp = new Snake(true);
        String expected = "Hiss!!!";
        String actual = temp.makeNoise();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getSnakeSpeed() {
        Animal temp = new Snake(true);
        int expected = 5;
        int actual = temp.getTopSpeed();
        Assert.assertEquals(expected,actual);
    }

}
