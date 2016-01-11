package Cowway;

public class World {
	private Farm[] allFarms = new Farm[2];
	private static int time;
	public World(int i, Farm[]all){
		time = i;
		allFarms=all;
	}
	public static void increaseTime(){
		time++;
	}
}
