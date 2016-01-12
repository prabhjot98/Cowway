package Cowway;

import java.util.Random;

public class Cow extends FarmObject {
    
    private String Name;
    private int hunger;
    private int age;
    private int sicknessLevel;
    
    public Cow(String name, int hunger, int age, int sicknessLevel, int x, int y) {
        super(x, y);
        Name = name;
        hunger = hunger;
        age = age;
        sicknessLevel = sicknessLevel;
    }
    
    public void Move() { 
        Random rand = new Random();
        setX(rand.nextInt((5 - 1) + 1) + 1);
        setY(rand.nextInt((5 - 1) + 1) + 1);
    }
}
