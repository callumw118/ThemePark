package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    private Visitor visitor;
    private Visitor tallVisitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(24, 185, 50);
        tallVisitor = new Visitor(25, 201, 25);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideRollercoaster(){
        assertTrue(rollerCoaster.isAllowedVisitor(visitor));
    }

    @Test
    public void getPriceForVisitor(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void getPriceForTallVisitor(){
        assertEquals(16.80, rollerCoaster.priceFor(tallVisitor), 0.01);
    }
}
