package item;

import item.interfaces.Item;
import item.interfaces.Eatable;
import main.Smell;


public class Trockenhefe implements Item{
    String name = \u0022Trockenhefe\u0022;
    int weight = 7; //in Gramm
    int hardness = 1; //Mohs
    Smell smell = new Smell(4);
    String phase = \u0022solid\u0022; //liquid, gas
    String description = \u0022Ist ja eigentlich schon Fleisch.\u0022;
    
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