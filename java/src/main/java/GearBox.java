

public class GearBox {

    private int currentGear = 0;
    private int lastRpm = 0;

    public void doit(int rpm) {
        if (currentGear < 0) {
            // do nothing!
            lastRpm = rpm;
        } else {
            if (currentGear > 0) {
                if (rpm > 2000)
                    currentGear++;
            } else if (rpm < 500) {
                currentGear--;
            }
        }
        if (currentGear > 6) {
            currentGear--;
        } else if (currentGear < 1) {
            currentGear++;
        }
        lastRpm = rpm;
    }

    public Gear getCurrentGear() {
        switch (currentGear) {
            case 1:
                return Gear.FIRST;
            case 2:
                return Gear.SECOND;
            case 3:
                return Gear.THIRD;
            case 4:
                return Gear.FOURTH;
            case 5:
                return Gear.FIFTH;
            case 6:
                return Gear.SIXTH;
            default:
                return Gear.NEUTRAL;
        }
    }
}
