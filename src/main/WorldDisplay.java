
package main;

import world.TestWorld;
import world.World;


public class WorldDisplay {
    public WorldDisplay(World world){
        int rowPosition = world.getRowLength();
        String[][] w = world.getWorld();
        for(int j = 0; j < w.length; j++){
            rowPosition--;
            System.out.print(w[j][0].charAt(0));
            if(rowPosition == 0){
                System.out.println("\f");
                rowPosition = world.getRowLength();
            }
        }
    }
}
