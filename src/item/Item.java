package item;

import main.Smell;
import java.awt.Dimension;


public interface Item { 
     void setWeight(int weight);
    
     void setHardness(int hardness);
    
     void setSmell (Smell smell);
     
     void setAggregateState (String phase);
}