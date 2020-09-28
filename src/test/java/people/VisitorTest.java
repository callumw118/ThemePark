package people;

import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Attraction attractionToVisit;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
        attractionToVisit = new RollerCoaster("Dragon's Khan", 10);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void canAddAttractionToArrayOfVisited(){
        visitor.addAttraction(attractionToVisit);
        assertEquals(attractionToVisit, visitor.getVisitedAttractions().get(0));
    }
}
