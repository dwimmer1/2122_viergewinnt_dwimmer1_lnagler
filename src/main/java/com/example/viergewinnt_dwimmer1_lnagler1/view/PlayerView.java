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
            System.out.println("Ist schon vergeben");
        }

        System.out.println("Spieler " + i + " welchen Namen willst du haben?");

        return "";
    }


    //                          Operations

    /**
     * @generated
     */
    public void showPlayer() {
        //TODO
    }

}
