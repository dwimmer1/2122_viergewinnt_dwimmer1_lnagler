package view;



public class PlayerView {
    public static int i = 0;

    /**
     * Funktionsbeschreibung
     * Erstellt spieler
     * @return 	string
     */
    public String createPlayer() {
        i++;
        if (i > 2) {
            i = 2;
        }

        System.out.println("Spieler " + i + " welchen Namen willst du haben?");

        return "";
    }

    public void vorhanden(){
        System.out.println("Ist schon vergeben");
    }
    //                          Operations

    /**
     * Funktionsbeschreibung
     * Zeigt welcher Spieler am Zug ist
     * @param    name name des Spielers
     * @return 	void
     */
    public void showPlayer(String name) {
        System.out.println("Spieler " + name + " ist am Zug");
        //TODO
    }

}
