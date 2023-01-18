import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectorTest {
    private Director director;

    @Before
    public void setUp() {
        director = new Director("Keith", "ZZ123456", 100000, "Frontend", 10);
    }

    @Test
    public void getName() {
        assertEquals("Keith", director.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals("ZZ123456", director.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(100000, director.getSalary(), 0.0);
    }

    @Test
    public void getDeptName() {
        assertEquals("Frontend", director.getDeptName());
    }

    @Test
    public void getBudget() {
        assertEquals(10, director.getBudget(), 0.0);
    }

    @Test
    public void raiseSalary() {
        director.raiseSalary(5000);
        assertEquals(105000, director.getSalary(), 0.0);
    }

    @Test
    public void payBonus() {
        double bonus = director.payBonus();
        assertEquals(2000, bonus, 0.0);
    }
}