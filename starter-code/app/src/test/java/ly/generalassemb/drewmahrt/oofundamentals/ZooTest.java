package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by andeski on 7/13/16.
 */
public class ZooTest {

    @Test
    public void createASnake() {
        Zoo temp = Zoo.getInstance();
        int num = temp.getAnimals().size() + 1;

        temp.addAnimal(new Snake(true));
        boolean expedted = false;

        if (temp.getAnimals().size() >= num) {
            expedted = true;
        }
        Assert.assertTrue(expedted);
    }

    @Test
    public void deleteASnake() {
        Zoo temp = Zoo.getInstance();
        int num = temp.getAnimals().size();
        temp.addAnimal(new Snake(true));

        temp.deleteAnimal(temp.getAnimals().get(temp.getAnimals().size()-1));

        boolean expected = false;

        if (temp.getAnimals().size() == num) {
            expected = true;
        }
        Assert.assertTrue(expected);
    }

}
