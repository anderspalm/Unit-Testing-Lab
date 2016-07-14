package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by andeski on 7/13/16.
 */
public class LionTest {

    @Test
    public void checkLionRoar() throws Exception{
        Animal temp = new Lion(true);
        String expected = "Roar!!!";
        String actual = temp.makeNoise();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speedLionChecker() throws Exception{
        Animal temp = new Lion(true);
        int expected = 50;
        int actual = temp.getTopSpeed();
        Assert.assertEquals(expected,actual);
    }


}
