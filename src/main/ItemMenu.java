package main;


public class ItemMenu {
    int rowLength = 0;
    String itemName = "Unknown Item";

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
        this.itemName = itemName;
    }
    
}
