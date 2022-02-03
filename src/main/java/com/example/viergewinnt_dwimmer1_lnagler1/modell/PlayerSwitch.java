package com.example.viergewinnt_dwimmer1_lnagler1.modell;


/**
 * @generated
 */
public class PlayerSwitch {


    //                          Operations                                  

    /**
     * Funktionsbeschreibung
     *
     * @param   currPlayer übergibt derzeitigen Spieler
     * @return Derzeitigen Spieler
     */
    public int nextPlayer(int currPlayer) {
        int player = 0;
        if (currPlayer == 0) {
            player = currPlayer + 1;

        } else {
            player = currPlayer - 1;
        }
        return player;


    }

}
