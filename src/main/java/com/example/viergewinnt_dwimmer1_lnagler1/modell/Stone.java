package com.example.viergewinnt_dwimmer1_lnagler1.modell;


import java.util.Objects;

/**
 * @generated
 */
public class Stone {

    /**
     * @generated
     */
    private static char symbol;
    String[] playerSymbol = {"X","O"};
    private char symbol1;
    public static boolean rv = true;

    /**
     * @generated
     */



    /**
     * @generated
     * @return
     */
    public String[] getSymbol() {
        return playerSymbol;
    }

    /**
     * @generated
     */
    public char setSymbol(char symbol) {
        this.symbol1 = symbol;

        if(proof()){
            Stone.symbol = '0';
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
