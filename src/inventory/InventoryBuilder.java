
package inventory;

import item.interfaces.Item;
import java.util.ArrayList;
import java.util.Arrays;


public class InventoryBuilder { //funktioniert noch nich so geil.
    public InventoryBuilder(Item[] items){         //Alphabetisch
        Arrays.sort(items);
        String buffer = items[0].getName();                    //Wenn Items doppelt vorkommen, kommen sie nacheinander im Array, da geordnet! Dadurch werden doppelte Items als 2 x "Item" bezeichnet :))))
        String outputBuffer = "";
        int itemCounter = 1;
        for(Item item : items){
            //System.out.println(item.getName() + " <- item counter --> " + itemCounter + buffer + "<-- buffer buffer.equals -->" + buffer.equals(item.getName()));
            if(buffer.equals(item.getName()))
                itemCounter++;
            else{
                outputBuffer = item.getName() + ": x" + itemCounter;
                itemCounter = 1;
                System.out.println(outputBuffer);
            }
            buffer = item.getName();
        }
    }
}
