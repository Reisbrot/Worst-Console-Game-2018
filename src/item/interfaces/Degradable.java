package item.interfaces;


public interface Degradable extends Item {
     Item[] getDegradationProducts(); //Item[] products
     int getHalfLife(); //int time
}
