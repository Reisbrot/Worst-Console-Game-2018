
package main;

import inventory.InventoryBuilder;
import item.Reisbrot;
import item.chemical.Cuban;
import item.interfaces.Item;
import world.TestWorld;

public class Moist {
    public static void main(String[] args){
         Reisbrot r = new Reisbrot();
         Cuban c = new Cuban();
         TestWorld t = new TestWorld();
         System.out.printf("Copyright (C) 2018 Reisbrot. No rights reserved. Just do what u want but mention me idc\n\n#####Werbung######\n");
         MenuBuilder builder = new MenuBuilder(" WOURLD! Hätte gern " + new java.math.BigDecimal(1).toString() + " Artist. Melden sie sich, wenn sie mit mir etwas gaanz kleines aufziehen wollen. \n\n Github: Reisbrot \n Twitter: Corn201 \n Discord: Reisbrot#1019\n\n\n\n\n\n");
         ItemMenu genericItem = new ItemMenu(r);
         ItemMenu genericChemical = new ItemMenu(c);
         InventoryBuilder invi = new InventoryBuilder(new Item[] {c,r,r});
         //Smell smell = new Smell(4);
         WorldDisplay wdisplay;
         while(true) //Update Loop des 7ødéß
         wdisplay = new WorldDisplay(t);
    }   
}
