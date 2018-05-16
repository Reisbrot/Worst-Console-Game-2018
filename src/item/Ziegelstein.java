package item;

import item.interfaces.Item;
import item.interfaces.Eatable;
import main.Smell;


public class Ziegelstein implements Item{
    String name = "Ziegelstein";
    int weight = 1000; //in Gramm
    int hardness = 4; //Mohs
    Smell smell = new Smell(1);
    String phase = "solid"; //liquid, gas
    String description = "Schlecht f\u00f6r die Z\u00e4hne.";
    
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
