
package main;

import item.Reisbrot;

public class Moist {
    public static void main(String[] args){
         Reisbrot r = new Reisbrot();
         MenuBuilder builder = new MenuBuilder(" WOURLD! Hätte gern " + new java.math.BigDecimal(1).toString() + " Artist. Melden sie sich, wenn sie mit mir etwas gaanz kleines aufziehen wollen. \n\n Github: Reisbrot \n Twitter: Corn201 \n Discord: Reisbrot#1019\n\n\n\n\n\n");
         ItemMenu genericItem = new ItemMenu(r);
         //Smell smell = new Smell(4);
    }   
}
