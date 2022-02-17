package modell;



import java.util.Objects;


public class Stone {


    private static char symbol;
    Character[] playerSymbol = {'X','O'};
    public char symbol1;
    public String color1;
    private static String color;
    public static boolean rv = true;

    /**
     * Funktionsbeschreibung
     * @return 	returned symbol 1
     */
    public char getSymbol1(){

        return symbol1;
    }
    /**
     * Funktionsbeschreibung
     * @return 	returned player Symbol
     */
    public Character[] getSymbol() {
        return playerSymbol;
    }
    public String getColor(){return color1;}

    /**
     * Funktionsbeschreibung
     *
     * @param   symbol Das eingegebene Spieler symbol
     */
    public char setSymbol(char symbol) {
        this.symbol1 = symbol;
        proof();

        return symbol;
    }

    public void setColor(String color){
        this.color1 = color;
        proof();
    }

    /**
     * Funktionsbeschreibung
        prüft ob symbol vom Spieler 1 das gleiche symbol wie von Spieler 2 ist
     * @return 	returned rv
     */

    public boolean proof(){
        if(!Objects.equals(this.symbol1, symbol) || !Objects.equals(this.color1, color)){
            symbol = symbol1;
            color = color1;
            rv = false;
        }else {
            rv = true;
        }
        return rv;
    }

}
