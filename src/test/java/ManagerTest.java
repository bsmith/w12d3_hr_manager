import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {
    private Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Misha", "AA123456", 50000, "Frontend");
    }

    @Test
    public void getName() {
        assertEquals("Misha", manager.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals("AA123456", manager.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(50000, manager.getSalary(), 0.0);
    }

    @Test
    public void getDeptName() {
        assertEquals("Frontend", manager.getDeptName());
    }

    @Test
    public void raiseSalary() {
        manager.raiseSalary(500);
        assertEquals(50500, manager.getSalary(), 0.0);
    }

    @Test
    public void cannotRaiseSalaryWithNegativeIncrement() {
        assertEquals("wrong increment",
                manager.raiseSalary(-500));
        assertEquals(50000, manager.getSalary(), 0.0);
    }

    @Test
    public void payBonus() {
        double bonus = manager.payBonus();
        assertEquals(500, bonus, 0.0);
    }

    @Test
    public void canChangeName() {
        manager.setName("Bob");
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void cannotChangeNameToNull() {
        manager.setName(null);
        assertEquals("Misha", manager.getName());
    }
}