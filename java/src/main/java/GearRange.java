/**
 * Created by cdowling on 5/7/17.
 */
public class GearRange {

    public static final int INVALID = -1;

    public int shiftUp;
    public int shiftDown;

    public GearRange() {
        shiftUp = INVALID;
        shiftDown = INVALID;
    }

    public GearRange(int down, int up) {
        shiftUp = up;
        shiftDown = down;
    }

}
