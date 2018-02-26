package main;

import world.TestWorld;


public class MainLoop {
    void loopy(){
        TestWorld t = new TestWorld();
        WorldDisplay wdisplay = new WorldDisplay(t);
        TestWorld x = t;
        for(int i = 0; i > -1; i++){ //proffesionel!
            if(!(t.getWorld().equals(x.getWorld()))){
            wdisplay = new WorldDisplay(t);
            x = new TestWorld();
            }
        }
    }
}
