import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by cdowling on 5/7/17.
 */
public class GearBoxTest {

    GearBox box;

    @Before
    public void setUp() {
        box = new GearBox();
    }

    @Test
    public void getCurrentGear_byDefault_returnsNeutral() {
        assertThat(box.getCurrentGear(), is(0));
    }

    @Test
    public void getCurrentGear_afterDoItWithRpmLessThanTwoThousand_returnsFirst() {
        box.doit(1000);
        assertThat(box.getCurrentGear(), is(1));
    }

    @Test
    public void getCurrentGear_startingFromNeutralAndDoItOverTwoThousand_returnsFirst() {
        shiftUp();
        assertThat(box.getCurrentGear(), is(1));
    }

    @Test
    public void getCurrentGear_afterShiftUpTwice_returnsSecond() {
        shiftUp();
        shiftUp();
        assertThat(box.getCurrentGear(), is(2));
    }

    @Test
    public void getCurrentGear_afterShiftUpThreeTimes_returnsThird() {
        shiftUp();
        shiftUp();
        shiftUp();
        assertThat(box.getCurrentGear(), is(3));
    }

    @Test
    public void getCurrentGear_afterShiftUpFourTimes_returnsFourth() {
        shiftUp();
        shiftUp();
        shiftUp();
        shiftUp();
        assertThat(box.getCurrentGear(), is(4));
    }

    @Test
    public void getCurrentGear_afterShiftUpFiveTimes_returnsFifth() {
        shiftUp();
        shiftUp();
        shiftUp();
        shiftUp();
        shiftUp();;
        assertThat(box.getCurrentGear(), is(5));
    }

    @Test
    public void getCurrentGear_afterShiftUpSixTimes_returnsSixth() {
        shiftUp();
        shiftUp();
        shiftUp();
        shiftUp();
        shiftUp();
        shiftUp();
        assertThat(box.getCurrentGear(), is(6));
    }

    @Test
    public void getCurrentGear_afterShiftUpSevenTimes_returnsSixth() {
        shiftUp();
        shiftUp();
        shiftUp();
        shiftUp();
        shiftUp();
        shiftUp();
        shiftUp();
        assertThat(box.getCurrentGear(), is(6));
    }

    @Test
    public void getCurrentGear_afterShiftUpTwiceAndShiftDown_returnsFirst() {
        shiftUp();
        shiftUp();
        shiftDown();
        assertThat(box.getCurrentGear(), is(1));
    }

    @Test
    public void getCurrentGear_afterShiftUpAndShiftDown_returnsFirst() {
        shiftUp();
        shiftDown();
        assertThat(box.getCurrentGear(), is(1));
    }

    private void shiftUp() {
        box.doit(2001);
    }

    private void shiftDown() {
        box.doit(200);
    }

}