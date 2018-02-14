

package item;

import main.Smell;


public class Chemical implements Item{
    String name = "undefined";
    int weight = 1;
    int hardness = 1;
    Smell smell = new Smell(0);
    String phase = "solid"; //liquid, gas
    int meltingTemperature = 1;
    int boilingTemperature = 1;
    String description = "W\u00e4hlt die Partei";

    public void setMeltingTemperature(int meltingTemperature) {
        this.meltingTemperature = meltingTemperature;
    }

    public void setBoilingTemperature(int boilingTemperature) {
        this.boilingTemperature = boilingTemperature;
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

    public int getMeltingTemperature() {
        return meltingTemperature;
    }

    public int getBoilingTemperature() {
        return boilingTemperature;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getAggregateState() {
        return phase;
    }

    @Override
    public String getName() {
        return name;
    }
 
    
}
