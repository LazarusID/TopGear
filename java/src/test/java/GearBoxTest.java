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
        assertThat(box.getCurrentGear(), is(Gear.NEUTRAL));
    }

    @Test
    public void getCurrentGear_afterDoItWithRpmLessThanTwoThousand_returnsFirst() {
        box.doit(1000);
        assertThat(box.getCurrentGear(), is(Gear.FIRST));
    }

    @Test
    public void getCurrentGear_startingFromNeutralAndDoItOverTwoThousand_returnsFirst() {
        box.doit(2001);
        assertThat(box.getCurrentGear(), is(Gear.FIRST));
    }

    @Test
    public void getCurrentGear_afterShiftUpTwice_returnsSecond() {
        box.doit(2001);
        box.doit(2001);
        assertThat(box.getCurrentGear(), is(Gear.SECOND));
    }

}