package item;


public interface Burnable extends Item{
     int getFuelValue(); //int fuelValue
     Item[] getCombustionProducts(); //Item[] products
     int getAutoignitionTemperature(); //<<Zündtemperatur>> int autignitionTemperature
}
