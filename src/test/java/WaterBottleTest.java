import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }
    @Test
    public void hasWater(){
        assertEquals(100, waterBottle.getVolume());
    }
    @Test
    public void hasDrunk(){
        assertEquals(90, waterBottle.reduceWater());
    }
    @Test
    public void isEmpty(){
        assertEquals(0, waterBottle.emptyBottle());
    }
    @Test
    public void hasRefilled(){
        waterBottle.emptyBottle();
        assertEquals(100, waterBottle.refill());
    }
}
