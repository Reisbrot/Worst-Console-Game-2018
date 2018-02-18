
package item.chemical;

import item.interfaces.Chemical;
import item.interfaces.Item;
import main.Smell;


public class Cuban implements Chemical{
   String name = "Cuban | C8H8";
   int weight = 1;
   int hardness = 1;
   Smell smell = new Smell(0);
   String phase = "solid"; //liquid, gas
   int meltingTemperature = 133;
   int boilingTemperature = 161;
   boolean decaysAtMeltingPoint = false;
   boolean decaysAtBoilingPoint = true;
   Chemical[] decayProducts = {new Cunean()};
   String description = "Adorable Würfel.";
   int phValue = 7;
   int triggerAmount = -1; //int amount
   String[] Symptoms = {}; //String[] symptoms
   int overdoseAmount = -1; //int overdoseAmount
   String[] overdoseSymptoms = {}; //String[] overdoseSymptoms
   double molarMass = 104.15; //In gramm/mol

    @Override
    public double getMolarMass() {
        return molarMass;
    }

    public int getTriggerAmount() {
        return triggerAmount;
    }

    public String[] getSymptoms() {
        return Symptoms;
    }

    public int getOverdoseAmount() {
        return overdoseAmount;
    }

    public String[] getOverdoseSymptoms() {
        return overdoseSymptoms;
    }

    public String getPhase() {
        return phase;
    }

    public int getPhValue() {
        return phValue;
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

    public int getMeltingPoint() {
        return meltingTemperature;
    }

    public int getBoilingPoint() {
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

    @Override
    public boolean isDecayingAtMeltingPoint() {
        return decaysAtMeltingPoint;
     }

    @Override
    public boolean isDecayingAtBoilingPoint() {
        return decaysAtBoilingPoint;
    }

    @Override
    public Item[] getDecayProducts() {
        return decayProducts;
    }
}
