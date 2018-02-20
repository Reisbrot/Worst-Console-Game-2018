
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
