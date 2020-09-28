package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    private Visitor visitor;
    private Visitor youngVisitor;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor = new Visitor(15, 140, 10);
        youngVisitor = new Visitor(10, 110, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void getPriceForVisitor(){
        assertEquals(4.50, dodgems.priceFor(visitor), 0.01);
    }

    @Test
    public void getPriceForYoungVisitor(){
        assertEquals(2.25, dodgems.priceFor(youngVisitor), 0.01);
    }
}
