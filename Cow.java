package Cowway;

import java.util.Random;

public class Cow extends FarmObject{
	private String Name;
	private int hunger;
	private int age;
	private int sicknessLevel;
	public Cow(String n, int i, int j, int k, int x, int y){
		super(x,y);
		Name=n;
		hunger=i;
		age=j;
		sicknessLevel=k;
	}
	public static void Move(){
		Random ran = new Random();
	}
}
