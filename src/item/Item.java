package item;

import main.Smell;
import java.awt.Dimension;


public interface Item { 
     int getWeight(); //int weight
    
     int getHardness(); //int hardness
    
     Smell getSmell(); //Smell smell
     
     String getAggregateState(); //String phase
     
     String getDescription(); //String description
}