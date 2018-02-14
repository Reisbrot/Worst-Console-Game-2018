package main;

import item.Item;


public class ItemMenu {
    int rowLength = 0;
    String itemName = "Unknown Item";
    String description = "";
    String aggregateState = "solid";
    String weight = "1 Gramm";
    String smell;

      ItemMenu(String itemName){
      System.out.printf("----" + itemName + "----\n");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.printf(RowEndBuilder().toString()+"\n");
    }
      ItemMenu(String itemName, String description){
      setItemName(itemName);
      setDescription(description);    
      System.out.printf("----" + itemName + "----\n");
      System.out.println(description);
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.printf(RowEndBuilder().toString()+"\n");
    }
      
    ItemMenu(Item item){
      setItemName(item.getName());
      setDescription(item.getDescription());
      setWeight(item.getWeight());
      setSmell(item.getSmell());
      setAggregateState(item.getAggregateState());
      
      System.out.printf("----" + itemName + "----\n");
      System.out.println(description);
      System.out.println("Aggregatszustand:  " + aggregateState);
      System.out.println("Geruchsintensität: " + smell);
      System.out.println("Gewicht:           " + weight);
      System.out.println("");
      System.out.println("");
      System.out.printf(RowEndBuilder().toString()+"\n");
    }
      
    public StringBuilder RowEndBuilder(){
     StringBuilder rowEnd = new StringBuilder();
     int rowLength = 4 + itemName.length() + 4;
     for(int i = 0; i < rowLength; i++)
         rowEnd.append('-');
     return rowEnd;
    }

    private void setItemName(String itemName) {
        this.itemName = itemName;
    }
    private void setDescription(String description) {
        this.description = description;
    }

    private void setAggregateState(String aggregateState) {
        switch(aggregateState){
            case "solid":  this.aggregateState = "Fest";           break;
            case "liquid": this.aggregateState = "Fl\u00fcssig";   break;
            case "gas":    this.aggregateState = "Gasf\u00d6rmig"; break;
            default:                                               break;
        }
    }

    private void setSmell(Smell smell) {
        this.smell = smell.getSmellString();
    }

    private void setWeight(int weightG) {
        if(weightG % 100 == 0){                  //Wenn keine Dezimal/Einerstellen
            double weight = weightG;
            this.weight = weight/1000 + "Kilogramm";
        } 
        else
        this.weight = weightG + "Gramm";
    }    
}
