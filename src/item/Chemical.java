

package item;

import main.Smell;


public class Chemical implements Item{
    int weight = 1;
    int hardness = 1;
    Smell smell = new Smell(0);
    String phase = "solid"; //liquid, gas
    int meltingTemperature = 1;
    int boilingTemperature = 1;

    public void setMeltingTemperature(int meltingTemperature) {
        this.meltingTemperature = meltingTemperature;
    }

    public void setBoilingTemperature(int boilingTemperature) {
        this.boilingTemperature = boilingTemperature;
    }
    
    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void setHardness(int hardness) {
        this.hardness = hardness;
    }

    @Override
    public void setSmell(Smell smell) {
        this.smell = smell;
    }

    @Override
    public void setAggregateState(String phase) {
        this.phase = phase;
    }
}
