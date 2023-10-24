

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KalkulackaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KalkulackaTest {
    private Kalkulacka kalkulac1;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        kalkulac1 = new Kalkulacka();
    }

    @Test
    public void scitaj2a3()
    {
        kalkulac1.zadajCislo(2);
        kalkulac1.pripocitaj(3);
        assertEquals(5, kalkulac1.getVysledok(), 0.1);
    }

    @Test
    public void vynasob5a8()
    {
        kalkulac1.zadajCislo(5);
        kalkulac1.vynasob(8);
        assertEquals(40, kalkulac1.getVysledok(), 0.1);
    }

    @Test
    public void vydel1a2()
    {
        kalkulac1.zadajCislo(1);
        kalkulac1.vydel(2);
        assertEquals(0.5, kalkulac1.getVysledok(), 0.1);
    }

    @Test
    public void vypocitaj2plus3()
    {
        kalkulac1.zadajCislo(2);
        assertEquals(true, kalkulac1.vypocitaj("+", 3));
        assertEquals(5, kalkulac1.getVysledok(), 0.1);
    }
}




