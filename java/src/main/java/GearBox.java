

public class GearBox {

    private int gear = 0;

    public void doit(int i) {
        if (gear > 0) {
            if (i > 2000)
                gear++;
            else if (i < 500) {
                gear--;
            }
        }
        if (gear > 6) {
            gear--;
        } else if (gear < 1) {
            gear++;
        }
    }

    public int getCurrentGear() {
        return gear;
    }

    public void setGearRange(int gear, int shiftDown, int shiftUp) {
        // TODO: Implement Me!
    }
}
