

package item;

import main.Smell;


public class Chemical implements Item{
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

    public int getWeight() {
        return weight;
    }

    public int getHardness() {
        return hardness;
    }

    public Smell getSmell() {
        return smell;
    }

    public String getPhase() {
        return phase;
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
 
    
}
