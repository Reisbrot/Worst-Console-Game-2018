package item;


public interface Degradable extends Item {
     Item[] getDegradationProducts(); //Item[] products
     int getHalfLife(); //int time
}
