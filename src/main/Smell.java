package main;

public class Smell {
    String smell;
    
    public Smell(){
        smell = "Geruchslos";
        System.out.println(this.smell);
    }
    
    public Smell(int smellscale){
        switch(smellscale){
            case 0: smell = "Geruchslos"; break;
            case 1: smell = "Sehr Schwach"; break;
            case 2: smell = "Schwach"; break;
            case 3: smell = "Gut Wahrnehmbar"; break;
            case 4: smell = "Sehr gut Wahrnehmbar"; break;
            case 5: smell = "Aufdringlich"; break;
            case 6: smell = "Penetrant"; break;
            case 7: smell = "Stechend"; break;
            case 8: smell = "Reizend"; break;
            default: smell = "Geruchslos";
        }
    }
    
    public Smell(String smell){
        this.smell = smell;
    }
    
    public String getSmellString(){
        return this.smell;
    }
}

