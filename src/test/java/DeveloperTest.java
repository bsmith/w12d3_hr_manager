import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.*;

public class DeveloperTest {
    private Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Tom", "AA6543210", 25000);
    }

    @Test
    public void getName() {
        assertEquals("Tom", developer.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals("AA6543210", developer.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(25000, developer.getSalary(), 0.0);
    }

    @Test
    public void raiseSalary() {
        developer.raiseSalary(100);
        assertEquals(25100, developer.getSalary(), 0.0);
    }

    @Test
    public void payBonus() {
        double bonus = developer.payBonus();
        assertEquals(250, bonus, 0.0);
    }

}