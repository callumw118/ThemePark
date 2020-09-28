package people;

import attractions.Attraction;
import behaviours.IReviewed;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;
    private ArrayList<Attraction> visitedAttractions;
    private ArrayList<IReviewed> whatVisitorCanVisit;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = new ArrayList<>();
        this.whatVisitorCanVisit = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList getVisitedAttractions(){
        return visitedAttractions;
    }

    public void addAttraction(Attraction attraction){
        this.visitedAttractions.add(attraction);
    }
}
