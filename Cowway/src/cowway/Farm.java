package Cowway;

public class Farm {
    
    private static FarmObject[][] Farm = new FarmObject[3][3];
    private static FarmObject[] allFarmObjects = new FarmObject[9];

    public Farm(FarmObject farm[]) {

    }
    static void setFarm(FarmObject object,int locationx,int locationy){
    	Farm[locationx][locationy]=object;
    }
}
