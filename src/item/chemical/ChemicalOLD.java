

package item.chemical;

import item.interfaces.Item;
import main.Smell;


public class ChemicalOLD implements Item{
    String name = "undefined";
    int weight = 1;
    int hardness = 1;
    Smell smell = new Smell(0);
    String phase = "solid"; //liquid, gas
    int meltingTemperature = 1;
    int boilingTemperature = 1;
    String description = "W\u00e4hlt die Partei";
    int phValue = 7;
    int triggerAmount; //int amount
    String[] Symptoms; //String[] symptoms
    int overdoseAmount; //int overdoseAmount
    String[] overdoseSymptoms; //String[] overdoseSymptoms

    public int getTriggerAmount() {
        return triggerAmount;
    }

    public void setTriggerAmount(int triggerAmount) {
        this.triggerAmount = triggerAmount;
    }

    public String[] getSymptoms() {
        return Symptoms;
    }

    public void setSymptoms(String[] Symptoms) {
        this.Symptoms = Symptoms;
    }

    public int getOverdoseAmount() {
        return overdoseAmount;
    }

    public void setOverdoseAmount(int overdoseAmount) {
        this.overdoseAmount = overdoseAmount;
    }

    public String[] getOverdoseSymptoms() {
        return overdoseSymptoms;
    }

    public void setOverdoseSymptoms(String[] overdoseSymptoms) {
        this.overdoseSymptoms = overdoseSymptoms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }

    public void setSmell(Smell smell) {
        this.smell = smell;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public int getPhValue() {
        return phValue;
    }

    public void setPhValue(int phValue) {
        this.phValue = phValue;
    }
    
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
