package view;


import modell.Player;

/**
 * @generated
 */
public class PlayerView {
    public static int i = 0;

    public String createPlayer() {
        i++;
        if (i > 2) {
            i = 2;
        }

        System.out.println("Spieler " + i + " welchen Namen willst du haben?");

        return "";
    }

    public void vorhanden(String s){
        System.out.println(s);
    }
    //                          Operations

    /**
     * @generated
     */
    public void showPlayer(String name) {
        System.out.println("Spieler " + name + " ist am Zug");
        //TODO
    }

}
