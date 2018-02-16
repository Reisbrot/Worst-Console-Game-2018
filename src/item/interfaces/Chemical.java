package item.interfaces;

import main.Smell;


public interface Chemical extends Item{
    public int getTriggerAmount() 
;
    public void setTriggerAmount(int triggerAmount) 
 ;
    public String[] getSymptoms() 
  ;
    public void setSymptoms(String[] Symptoms) 
 ;           
    public int getOverdoseAmount() 
;
    public void setOverdoseAmount(int overdoseAmount) 
;
    public String[] getOverdoseSymptoms() 
;
    public void setOverdoseSymptoms(String[] overdoseSymptoms) 
;
    public void setName(String name) 
;
    public void setWeight(int weight) 
;
    public void setHardness(int hardness) 
;
    public void setSmell(Smell smell) 
 ;          
    public void setDescription(String description) 
;
    public String getPhase() 
;
    public void setPhase(String phase) 
;
    public int getPhValue() 
;
    public void setPhValue(int phValue) 
;
    public void setMeltingTemperature(int meltingTemperature) 
;
    public void setBoilingTemperature(int boilingTemperature) 
;
    public int getMeltingTemperature() ;


    public int getBoilingTemperature(); 


    public String getDescription() ;

    public String getAggregateState(); 



    public String getName();
}
