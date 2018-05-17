
package inventory;

import dev.PrintField;
import item.comparators.Alphabetical;
import item.interfaces.Item;
import java.awt.ItemSelectable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class InventoryBuilder { //funktioniert noch nich so geil.
    public InventoryBuilder(Item[] items){         //Alphabetisch
        
        PrintField.printArray(items);
        ArrayList<Item> i = new ArrayList<Item>(Arrays.asList(items));
        Collections.sort(i);
        items = i.toArray(items);
        PrintField.printArray(items);

        String buffer = items[0].getName(); 
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
