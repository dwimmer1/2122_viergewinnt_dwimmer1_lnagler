package com.example.viergewinnt_dwimmer1_lnagler1.modell;


import com.example.viergewinnt_dwimmer1_lnagler1.view.StoneView;

import java.util.Objects;

/**
 * @generated
 */
public class Stone {

    /**
     * @generated
     */
    private static char symbol;
    Character[] playerSymbol = {'X','O'};
    public char symbol1;
    public static boolean rv = true;

    /**
     * @generated
     */


    public char getSymbol1(){

        return symbol1;
    }
    /**
     * @generated
     * @return
     */
    public Character[] getSymbol() {
        return playerSymbol;
    }

    /**
     * @generated
     */
    public char setSymbol(char symbol) {
        this.symbol1 = symbol;

        if(proof()){
            StoneView st = new StoneView();
            st.vorhanden();
        }else {
            Stone.symbol = symbol1;
        }
                return Stone.symbol;
    }

    /**
     * @generated
     */
    //public String;

    public boolean proof(){
        if(!Objects.equals(this.symbol1, symbol)){
            symbol = symbol1;
            rv = false;
        }else {
            rv = true;
        }
        return rv;
    }



    //                          Operations                                  

    /**
     * @generated
     */
    public void chooseSettings() {
        //TODO
    }
}
