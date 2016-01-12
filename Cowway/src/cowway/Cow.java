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
        this.hunger = hunger;
        this.age = age;
        this.sicknessLevel = sicknessLevel;
    }
    
    public void Move() { 
        System.out.println("Cow \"" + this.Name + "\"'s original position: (" + getX() + "," + getY() + ").");
        Random rand = new Random();
        int XorY = rand.nextInt((1 - 0) + 1) + 0;
        int upOrDown = rand.nextInt((1 - 0) + 1) + 0;
        if (XorY == 0) {
            if (upOrDown == 0) {
                if (getX() != 0) {
                    setX(getX() - 1);
                }
            } else {
                if (getX() != 5) {
                    setX(getX() + 1);
                }
            }
        } else {
            if (upOrDown == 0) {
                if (getY() != 0) {
                    setY(getY() - 1);
                }
            } else {
                if (getY() != 5) {
                    setY(getY() + 1);
                }
            }
        }
        System.out.println("Cow \"" + this.Name + "\"'s new position: (" + getX() + "," + getY() + ").");
    }
    
    public void farmObjectSetX(int x) {
        setX(x);
    }
    
    public void farmObjectSetY(int y) {
        setY(y);
    }
    
}
