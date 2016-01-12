/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cowway;

import java.util.Random;

/**
 *
 * @author Mitchell
 */
public class FlyingCow extends Cow {
    
    public FlyingCow(String name, int hunger, int age, int sicknessLevel, int x, int y) {
        super(name, hunger, age, sicknessLevel, x, y);
    }
    
    public void Move() {
        Random rand = new Random();
        
//        super.farmObjectSetX(rand.nextInt((5 - 1) + 1) + 1);
//        super.farmObjectSetY(rand.nextInt((5 - 1) + 1) + 1);        
    }
}