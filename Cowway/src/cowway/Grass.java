package Cowway;

public class Grass extends FarmObject{
	private static int GrassAmount;
	public Grass (int amount,int x,int y){
		super(x,y);
	}
	public static void IncreaseGrass(){
		GrassAmount++;
	}
}
