
package item.chemical;

import item.interfaces.Chemical;
import item.interfaces.Item;
import main.Smell;


public class Cuban implements Chemical{
   String name = "SCuban | C8H8";
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

    @Override
    public int compareTo(Item ii) {
        char a,b,c,d,e,f,g,h,i,j,k; a = '0'; b = '0'; c = '0'; d = '0'; e = '0'; f = '0'; g = '0'; h = '0'; i = '0'; j = '0';
        try{
        a = ii.getName().charAt(0);
        b = ii.getName().charAt(1);
        c = ii.getName().charAt(2);
        d = ii.getName().charAt(3);
        e = ii.getName().charAt(4);
        
        f = getName().charAt(0);
        g = getName().charAt(1);
        h = getName().charAt(2);
        i = getName().charAt(3);
        j = getName().charAt(4);
        }
        catch(Exception ex){
            if(a == f)
                if(b == g)
                    if(c == h)
                        if(d == i)
                            if(e == j)
                                return -1;
            else
                                return Math.abs(e - j);
            else
                            return Math.abs(d - i);
            else
                        return Math.abs(c - h);
            else
                    return Math.abs(b - g);
            else
                Math.abs(a - f);
        }
        return Math.abs(a - f);
    }
}
