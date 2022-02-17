package modell;


import javax.swing.text.View;
import java.util.Objects;

/**
 * @generated
 */
public class Conditions {

    /**
     * Funktionsbeschreibung
     * Dient zur prüfung des Wins
     *
     * @param field        FeldArray (Spielfeld)
     * @param stringSymbol Symbol für den Spieler der derzeit dran ist
     * @return checkWin Returned das der Spieler gewonnen hat
     */
    public boolean win(String[][] field, String stringSymbol) {
        boolean checkWin = false;
        for (int i = 0; i <= 5; i++) {          //Horizontale Gewinnbedingung
            for (int j = 0; j <= 6; j++) {
                if (Objects.equals(field[i][j], stringSymbol) && Objects.equals(field[i][j + 1], stringSymbol) && Objects.equals(field[i][j + 2], stringSymbol) && Objects.equals(field[i][j + 3], stringSymbol)) {
                    System.out.println("Win");
                    checkWin = true;
                }
            }

        }

        for (int j = 0; j < 6; j++) {          //Vertikale Gewinnbedingung
            for (int i = 5; i >= 0; i--) {
                if (Objects.equals(field[i][j], stringSymbol) && Objects.equals(field[i - 1][j], stringSymbol) && Objects.equals(field[i - 2][j], stringSymbol) && Objects.equals(field[i - 3][j], stringSymbol)) {
                    System.out.println("Win");
                    checkWin = true;

                }
            }
        }
        for (int i = 0; i < 3; i++) {           // Diagonal links-rechts
            for (int j = 0; j < 4; j++) {
                if (Objects.equals(field[i][j], stringSymbol) && Objects.equals(field[i + 1][j + 1], stringSymbol) && Objects.equals(field[i + 2][j + 2], stringSymbol) && Objects.equals(field[i + 3][j + 3], stringSymbol)) {
                    System.out.println("Win");
                    checkWin = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {           // Diagonal rechts-links
            for (int j = 6; j >= 3; j--) {
                if (Objects.equals(field[i][j], stringSymbol) && Objects.equals(field[i + 1][j - 1], stringSymbol) && Objects.equals(field[i + 2][j - 2], stringSymbol) && Objects.equals(field[i + 3][j - 3], stringSymbol)) {
                    System.out.println("Win");
                    checkWin = true;
                }
            }
        }
        return checkWin;
    }

    /**
     * Funktionsbeschreibung
     * loose condition wenn verloren
     * @return 	none
     */
    public void loose() {
        //TODO
    }

    /**
     * Funktionsbeschreibung
     *  draw condition wenn untentschieden
     * @param    field feld array
     * @param    symbol symbol des Spieles
     * @return 	void
     */

    public void draw(String[][] field,String symbol) {
        for (int i = 0; i < 6; i++) {
             if (Objects.equals(field[0][i],symbol)){
                System.out.println("Untentschieden");
             }
        }

    }

}
