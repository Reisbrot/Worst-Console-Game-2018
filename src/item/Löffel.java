package item;

import item.interfaces.Item;
import item.interfaces.Eatable;
import main.Smell;


public class Löffel implements Item{
    String name = \u0022Löffel\u0022;
    int weight = 60; //in Gramm
    int hardness = 4; //Mohs
    Smell smell = new Smell(0);
    String phase = \u0022solid\u0022; //liquid, gas
    String description = \u0022Eine Gravur verrät: Edelstahl Rostfrei, BGN Manufaktur. Rostblüten zu erkennen.\u0022;
    
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