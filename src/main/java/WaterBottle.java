import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class WaterBottle {
    private int volume = 100;

    public int getVolume() {
        return volume;
    }

    public int reduceWater() {
        return volume - 10;
    }

    public int emptyBottle() {
        volume = 0;
        return getVolume();
    }

    public int refill() {
        volume = 100;
        return volume;
    }
}
