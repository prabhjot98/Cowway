/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cowway;

/**
 *
 * @author Mitchell
 */
public class Cowway {

    /**
     * @param args the command line arguments
     */
	//All cows
	private static Cow June = new Cow("June",0,0,0,0,0);
	private static Cow July = new Cow("July",0,0,0,1,0);
	//Cow array
	private static Cow Summer = new Cow("Summer",0,0,0,2,0);
	private static Cow[] allcows = {June,July,Summer};
	//All grass
	private static Grass grass1 = new Grass(0,0,1);
	private static Grass grass2 = new Grass(0,1,1);
	private static Grass grass3 = new Grass(0,2,1);
	private static Grass grass4 = new Grass(0,0,2);
	private static Grass grass5 = new Grass(0,1,2);
	private static Grass grass6 = new Grass(0,2,2);
	// Farm
	private static Farm testfarms = new Farm(allcows);
    public static void main(String[] args) {
    	testfarms.setFarm(grass1,0,1);
    	testfarms.setFarm(grass2,1,1);
    	testfarms.setFarm(grass3,2,1);
    	testfarms.setFarm(grass4,0,2);
    	testfarms.setFarm(grass5,1,2);
    	testfarms.setFarm(grass6,2,2);
    }
    
}
