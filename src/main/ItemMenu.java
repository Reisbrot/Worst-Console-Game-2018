package main;


public class ItemMenu {
    static int rowLength = 0;
    static String itemName = "Unknown Item";

    
       public void ItemMenu(String itemName){
      System.out.printf("----" + itemName + "----\n");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.printf(RowEndBuilder().toString()+"\n");
    }
      public void ItemMenu(String itemName, String description){
          
      System.out.printf("----" + itemName + "----\n");
      System.out.println("");
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
    
}
