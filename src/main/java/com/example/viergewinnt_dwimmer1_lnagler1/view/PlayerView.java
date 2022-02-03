package com.example.viergewinnt_dwimmer1_lnagler1.view;


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

    public void vorhanden(){
        System.out.println("Ist schon vergeben");
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
