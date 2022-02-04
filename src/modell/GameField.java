package modell;


/**
* @generated
*/
public class GameField {
    
    /**
    * @generated
     * Feld mit 6 Rows und 7 Columns (Spalten)
    */
    String[][] fieldXY = new String[6][7];
    int[] einwurfFeld = new int[6];
    private Integer x;
    /**
     * d
    * @generated
     *
     * setzt die X und Y koord auf ein leeres Zeichen (#)
    */

    
    public void SetXY(){
        for (int i = 0; i < fieldXY.length; i++) {
            for (int j = 0; j < fieldXY[i].length; j++) {
                fieldXY[i][j] = "#";
            }

        }
    }

    public int[] getEinwurfFeld() {
        return einwurfFeld;
    }

    /**
    * @generated
     * @return
    */
    public String[][] getFieldXY() {
        return this.fieldXY;
    }
    
    /**
    * @generated
    public int[][] setFieldXY() {
    //
    return "1";
    }
     */

    
    /**
    * @generated
    */
    public Integer getX() {
        return this.x;
    }

    /**
     * Funktionsbeschreibung
     *
     * @param    x übergibt x koord
     * @return 	none
     */
    public void setX(int x) {
        this.x = x;
    }
    
    

    //                          Operations                                  

    /**
    * @generated,3
     * Dient zum spielen bzw spiel feld benutzn
     */
    public void use() {
        //TODO
    }
    /**
    * @generated
     * prüft ob ein feld bereits benutz ist
    */
    public boolean isUsed() {
        //TODO

        return false;
    }
    
}
