package item.interfaces;


public interface Eatable extends Item{
    
     int getEnergyValue(); //int energyValue
     Item[] getNutrients(); //Item[] nutrients
     int getOverdoseAmount(); //int amount
     String[] getOverdoseSymptoms(); //String[] symptoms
     int getWaterContent(); //int waterContent
}
