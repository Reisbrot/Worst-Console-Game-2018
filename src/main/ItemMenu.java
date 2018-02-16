package main;

import item.interfaces.Item;


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
      System.out.printf(RowBottomBuilder().toString()+"\n");
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
      System.out.printf(RowBottomBuilder().toString()+"\n");
    }
      
    ItemMenu(Item item){
      setItemName(item.getName());
      setDescription(item.getDescription());
      setWeight(item.getWeight());
      setSmell(item.getSmell());
      setAggregateState(item.getAggregateState());
      
      System.out.printf(RowTopBuilder() + itemName + RowTopBuilder() + "\n");
      System.out.println(description);
      System.out.println("Aggregatszustand:  " + aggregateState);
      System.out.println("Geruchsintensität: " + smell);
      System.out.println("Gewicht:           " + weight);
      System.out.println("");
      System.out.println("");
      System.out.printf(RowBottomBuilder()+"\n");
    }
     StringBuilder RowTopBuilder(){
        int rowLength = (38 - itemName.length()/2)/2;         //Hälfte der gesamten Länge minus ItemName, weil muss auf beide Seiten oben                   
        StringBuilder rowTop = new StringBuilder();
        if(description.length() > 38)                         //38 ist längstes anderes Attribut, "sehr gut wahrnehmbar"
        rowLength = (description.length() - itemName.length()/2)/2;
        for(int i = 0; i < rowLength; i++)
            rowTop.append('-');
        return rowTop;
     } 
    
     StringBuilder RowBottomBuilder(){
        StringBuilder rowEnd = new StringBuilder(RowTopBuilder().append(RowTopBuilder()));  //Die Länge wie oben, ItemName fehlt noch
        int rowLength = itemName.length();
        for(int i = 0; i < rowLength; i++)
            rowEnd.append('-');                                                             //Wird hier drangehängt
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
