
package item;

import item.interfaces.Item;
import item.interfaces.Eatable;
import main.Smell;


public class Reisbrot implements Eatable{
    String name = "Reisbrot";
    int weight = 375; //in Gramm
    int energyValue = 3687; //in FOPS/Joule in RL
    Item[] nutrients = {}; //Eigentlich andere Sachen
    int overdoseAmount = 435; //Gramm
    String[] overdoseSymptoms = {"Verstopfung"}; //Kriegen noch ne eigene Klasse, damit sie auch was bewirken (:
    int waterContent = 38; //Prozent
    int hardness = 1; //Mohs
    Smell smell = new Smell(3);
    String phase = "solid"; //liquid, gas
    String description = "Lecker! Schmeckt nach Entwickler. Und nach Reis.";
    
    @Override
    public String getName(){
        return name;   
    }
    
    @Override
    public int getEnergyValue() {
        return energyValue;
    }

    @Override
    public Item[] getNutrients() {
        return nutrients;
    }

    @Override
    public int getOverdoseAmount() {
        return overdoseAmount;
    }

    @Override
    public String[] getOverdoseSymptoms() {
        return overdoseSymptoms;
    }

    @Override
    public int getWaterContent() {
        return waterContent;
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
