package item.comparators;

import item.interfaces.Item;
import java.util.Comparator;

public class Alphabetical implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }
}