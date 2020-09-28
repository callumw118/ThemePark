import attractions.Attraction;
import attractions.Playground;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviews;
    private HashMap<String, Integer> allReviews;
    private ArrayList<IReviewed> allThatVisitorCanDo;

    public ThemePark(){ ;
        attractions = new ArrayList<>();
        stalls = new ArrayList<>();
        reviews = new ArrayList<>();
        allReviews = new HashMap<>();
        allThatVisitorCanDo = new ArrayList<>();
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return reviews;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.addVisitCount();
        visitor.addAttraction(attraction);
    }

    public HashMap<String, Integer> getAllReviews() {
        return allReviews;
    }

    public void addReview(Attraction attraction){
        this.allReviews.put(attraction.getName(), attraction.getRating());
    }

    public ArrayList<IReviewed> getAllowedFor(Visitor visitor){
        if(visitor.getAge() <= 15){
            this.allThatVisitorCanDo.add(new Playground("Playground1", 10));
        }
        return this.allThatVisitorCanDo;
    }
}
