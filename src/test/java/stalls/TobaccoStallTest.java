package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    private Visitor visitor;
    private Visitor underAgeVisitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitor = new Visitor(20, 178, 40);
        underAgeVisitor = new Visitor(16, 160, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canBuyTobacco(){
        assertTrue(tobaccoStall.isAllowedVisitor(visitor));
    }

    @Test
    public void cannotBuyTobacco(){
        assertFalse(tobaccoStall.isAllowedVisitor(underAgeVisitor));
    }
}
