
package world;


public class TestWorld implements World{
    String[][] world = {
        {"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},
        {"#",""},{" ",""},{" ",""},{" ",""},{" ",""},{" ",""},{" ",""},{" ",""},{" ",""},{" ",""},{"#",""},{"I",""},{"#",""},{" ",""},
        {"#",""},{"#",""},{" ",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{" ",""},{"#",""},{" ",""},{"#",""},{" ",""},{"#",""},
        {"#",""},{"#",""},{" ",""},{"#",""},{"#",""},{"#",""},{"#",""},{" ",""},{" ",""},{"#",""},{"#",""},{"#",""},{" ",""},{"#",""},
        {"#",""},{"#",""},{" ",""},{" ",""},{"#",""},{"#",""},{"#",""},{" ",""},{"#",""},{"#",""},{"#",""},{"#",""},{" ",""},{"#",""},
        {"#",""},{"#",""},{"#",""},{" ",""},{"#",""},{"#",""},{"#",""},{" ",""},{"#",""},{"#",""},{"#",""},{" ",""},{" ",""},{"#",""},
        {"#",""},{"#",""},{"#",""},{" ",""},{"#",""},{"#",""},{"#",""},{" ",""},{"#",""},{"#",""},{"#",""},{" ",""},{" ",""},{"#",""},
        {"#",""},{"#",""},{"#",""},{" ",""},{"#",""},{"#",""},{"#",""},{" ",""},{"#",""},{"#",""},{"#",""},{" ",""},{" ",""},{"#",""},
        {"#",""},{" ",""},{" ",""},{"~",""},{"~",""},{" ",""},{" ",""},{" ",""},{"#",""},{"#",""},{"#",""},{" ",""},{" ",""},{"#",""},
        {"#",""},{" ",""},{"~",""},{"~",""},{"~",""},{" ",""},{" ",""},{" ",""},{" ",""},{" ",""},{" ",""},{" ",""},{" ",""},{"#",""},
        {"#",""},{" ",""},{"~",""},{"~",""},{"~",""},{"~",""},{" ",""},{" ",""},{" ",""},{"I","Reisbrot"},{"I",""},{"I",""},{" ",""},{"#",""},
        {"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},{"#",""},
    };
    //# = Solid, ~ = Wasser; "" = Nix; I = Item; W = Wrapper (fuer Item); P = Standort; C = Corrupt (Falsche Metadaten/Unb. Typ uebergeben)

    @Override
    public String[][] getWorld() {
        return this.world;
    }

    @Override
    public void setThing(int pos, char type, String meta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
