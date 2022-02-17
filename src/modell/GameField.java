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
     * Funktionsbeschreibung
     *setzt die X und Y koord auf ein leeres Zeichen (#)
     * @return 	void
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
     * Funktionsbeschreibung
     * returnd SpielFeld
     * @return 	fieldXY
     */
    public String[][] getFieldXY() {
        return this.fieldXY;
    }

    /**
     * Funktionsbeschreibung
     * bekommt x koordinate
     * @return 	x
     */
    public Integer getX() {
        return this.x;
    }

    /**
     * Funktionsbeschreibung
     * @param    x übergibt x koord
     * @return 	void
     */
    public void setX(int x) {
        this.x = x;
    }

    
}
