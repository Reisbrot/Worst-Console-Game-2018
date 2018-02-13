package item;


public interface Degradable extends Item {
     void getDegradationProduct(Item[] products);
     void getHalfLife(int time);
}
