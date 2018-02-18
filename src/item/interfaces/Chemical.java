package item.interfaces;

import main.Smell;


public interface Chemical extends Item{
    
    public boolean isDecayingAtMeltingPoint();
    
    public boolean isDecayingAtBoilingPoint();
    
    public Item[] getDecayProducts();
    
    public double getMolarMass();
    
    
    public int getTriggerAmount() 
;

    public String[] getSymptoms() 
  ;
       
    public int getOverdoseAmount() 
;

    public String[] getOverdoseSymptoms() 
;

    public String getPhase() 
;

    public int getPhValue() 
;
    public int getMeltingPoint();


    public int getBoilingPoint(); 


    public String getDescription() ;

    public String getAggregateState(); 



    public String getName();
}
