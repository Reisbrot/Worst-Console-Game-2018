package dev;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.Smell;

public class ItemClassTemplate {
    public static void createItem(String name, int weight, int hardness, Smell smell, String phase, String description){
        writeTo(name + ".java", 
"package item;\n" +
"\n" +
"import item.interfaces.Item;\n" +
"import item.interfaces.Eatable;\n" +
"import main.Smell;\n" +
"\n" +
"\n" +
"public class " + name + " implements Item{\n" +
"    String name = \\u0022" + name + "\\u0022;\n" +
"    int weight = " + weight + "; //in Gramm\n" +
"    int hardness = " + hardness + "; //Mohs\n" +
"    Smell smell = new Smell(" + smell.getSmellValue() + ");\n" +
"    String phase = \\u0022" + phase + "\\u0022; //liquid, gas\n" +
"    String description = \\u0022" + description + "\\u0022;\n" +
"    \n" +
"    @Override\n" +
"    public String getName(){\n" +
"        return name;   \n" +
"    }\n" +
"\n" +
"    @Override\n" +
"    public int getWeight() {\n" +
"        return weight;\n" +
"    }\n" +
"\n" +
"    @Override\n" +
"    public int getHardness() {\n" +
"        return hardness;\n" +
"    }\n" +
"\n" +
"    @Override\n" +
"    public Smell getSmell() {\n" +
"        return smell;\n" +
"    }\n" +
"\n" +
"    @Override\n" +
"    public String getAggregateState() {\n" +
"        return phase;\n" +
"    }\n" +
"\n" +
"    @Override\n" +
"    public String getDescription() {\n" +
"        return description;\n" +
"    }\n" +
"\n" +
"    @Override\n" +
"    public int compareTo(Item ii) {\n" +
"        char a,b,c,d,e,f,g,h,i,j,k; a = '0'; b = '0'; c = '0'; d = '0'; e = '0'; f = '0'; g = '0'; h = '0'; i = '0'; j = '0';\n" +
"        try{\n" +
"        a = ii.getName().charAt(0);\n" +
"        b = ii.getName().charAt(1);\n" +
"        c = ii.getName().charAt(2);\n" +
"        d = ii.getName().charAt(3);\n" +
"        e = ii.getName().charAt(4);\n" +
" \n" +
"        f = getName().charAt(0);\n" +
"        g = getName().charAt(1);\n" +
"        h = getName().charAt(2);\n" +
"        i = getName().charAt(3);\n" +
"        j = getName().charAt(4);\n" +
"        }\n" +
"        catch(Exception ex){\n" +
"            if(a == f)\n" +
"                if(b == g)\n" +
"                    if(c == h)\n" +
"                        if(d == i)\n" +
"                            if(e == j)\n" +
"                                return -1;\n" +
"            else\n" +
"                                return Math.abs(e - j);\n" +
"            else\n" +
"                            return Math.abs(d - i);\n" +
"            else\n" +
"                        return Math.abs(c - h);\n" +
"            else\n" +
"                    return Math.abs(b - g);\n" +
"            else\n" +
"                Math.abs(a - f);\n" +
"        }\n" +
"        return Math.abs(a - f);\n" +
"    }\n" +
"\n" +
"}"
                
                
                
                
                
                    );
    }
    
        public static void writeTo(String fileName, String content) {
            PrintWriter textFileWriter = null;
        try {
            String savePath = System.getProperty("user.dir") + System.getProperty("file.separator") + "src\\" + "item";
            File saveLocation = new File(savePath);
            saveLocation.mkdir();
            File myFile = new File(savePath, fileName);
            textFileWriter = new PrintWriter(new FileWriter(myFile));
            textFileWriter.write(content);
            textFileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(ItemClassTemplate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            textFileWriter.close();
        }
         }
}
