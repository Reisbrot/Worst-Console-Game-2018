package item;

import item.interfaces.Item;
import item.interfaces.Eatable;
import main.Smell;


public class Trockenhefe implements Item{
    String name = \u0022Trockenhefe\u0022;
    int weight = 7; //in Gramm
    int hardness = 1; //Mohs
    Smell smell = new Smell(4);
    String phase = \u0022solid\u0022; //liquid, gas
    String description = \u0022Ist ja eigentlich schon Fleisch.\u0022;
    
    @Override
    public String getName(){
        return name;   
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getHardness() {
        return hardness;
    }

    @Override
    public Smell getSmell() {
        return smell;
    }

    @Override
    public String getAggregateState() {
        return phase;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Item ii) {
        return name.compareTo(ii.getName());
    }

}