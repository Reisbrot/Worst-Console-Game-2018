
package inventory;

import item.interfaces.Item;
import java.util.Arrays;


public class InventoryBuilder {
    InventoryBuilder(Item[] items){         //Alphabetisch
        Arrays.sort(items);
        String buffer = "";                     //Wenn Items doppelt vorkommen, kommen sie nacheinander im Array, da geordnet! Dadurch werden doppelte Items als 2 x "Item" bezeichnet :))))
        String outputBuffer = "";
        int itemCounter = 1;
        for(Item item : items){
            if(buffer.equals(item.getName()))
                itemCounter++;
            else{
                outputBuffer = item.getName() + ": x" + itemCounter;
                itemCounter = 1;
            }
            buffer = item.getName();
            System.out.println(outputBuffer);
        }
    }
}