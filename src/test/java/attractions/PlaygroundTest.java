package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    private Visitor visitor;
    private Visitor oldVisitor;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(8, 140, 0);
        oldVisitor = new Visitor(30, 183, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canVisitPlayground(){
        assertTrue(playground.isAllowedVisitor(visitor));
    }

    @Test
    public void cannotVisitPlayground(){
        assertFalse(playground.isAllowedVisitor(oldVisitor));
    }

}
