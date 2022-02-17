package modell;



import java.util.Objects;


public class Stone {


    private static char symbol;
    Character[] playerSymbol = {'X','O'};
    public char symbol1;
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

    /**
     * Funktionsbeschreibung
        prüft ob symbol vom Spieler 1 das gleiche symbol wie von Spieler 2 ist
     * @return 	returned rv
     */

    public boolean proof(){
        if(!Objects.equals(this.symbol1, symbol)){
            symbol = symbol1;
            rv = false;
        }else {
            rv = true;
        }
        return rv;
    }

}
