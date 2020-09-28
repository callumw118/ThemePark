import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;
    private Visitor visitor;
    private Attraction attraction;

    @Before
    public void before(){
        themePark = new ThemePark();
        visitor = new Visitor(20, 188, 20);
        attraction = new RollerCoaster("Dragon's Khan", 10);
    }

    @Test
    public void canRunVisitFunction(){
        themePark.visit(visitor, attraction);
        assertEquals(1, attraction.getVisitCount());
        assertEquals(attraction, visitor.getVisitedAttractions().get(0));
    }

    @Test
    public void canAddReview(){
        themePark.addReview(attraction);
        assertEquals(1, themePark.getAllReviews().size());
    }

    @Test
    public void canGetEverythingTheVisitorCanVisit(){
        themePark.getAllowedFor(visitor);
    }
}
