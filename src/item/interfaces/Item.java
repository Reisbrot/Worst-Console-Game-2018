package item.interfaces;

import main.Smell;
import java.awt.Dimension;


public interface Item extends Comparable<Item>{ 
    String getName(); //String name
    
     int getWeight(); //int weight
    
     int getHardness(); //int hardness
    
     Smell getSmell(); //Smell smell
     
     String getAggregateState(); //String phase
     
     String getDescription(); //String description
     
     int compareTo(Item o);
}