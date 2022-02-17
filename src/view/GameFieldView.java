package view;


/**
* @generated
*/
public class GameFieldView {

    /**
     * Funktionsbeschreibung
     * printet das game field in die Console
     * @param    field SpielFeld
     * @return 	void
     */
    public void showGameField(String[][] field) {
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {

                System.out.print( "\t" + field[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");

    }
    
}
