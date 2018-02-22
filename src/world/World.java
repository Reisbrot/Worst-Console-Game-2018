package world;


public interface World {
    String[][] getWorld(); //Von obenLinks nach untenRechts. 1. Dimension ist Material, 2. Dimension sind Metadaten.
    void setThing(int pos, char type, String meta); //Todo rename lol
}
