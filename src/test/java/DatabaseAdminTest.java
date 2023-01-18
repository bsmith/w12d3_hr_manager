import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.*;

public class DatabaseAdminTest {
    private DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Ben", "AA654321", 45000);
    }

    @Test
    public void getName() {
        assertEquals("Ben", databaseAdmin.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals("AA654321", databaseAdmin.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(45000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void raiseSalary() {
        databaseAdmin.raiseSalary(400);
        assertEquals(45400, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void payBonus() {
        double bonus = databaseAdmin.payBonus();
        assertEquals(450, bonus, 0.0);
    }

}