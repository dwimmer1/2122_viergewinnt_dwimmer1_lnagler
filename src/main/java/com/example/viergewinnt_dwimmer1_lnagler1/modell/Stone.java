package com.example.viergewinnt_dwimmer1_lnagler1.modell;


import java.util.Objects;

/**
* @generated
*/
public class Stone {
    
    /**
    * @generated
    */
    private char symbol;
    private char symbol1;
    
    /**
    * @generated
    */
    
    
    
    /**
    * @generated
    */
    public char getSymbol() {
        return this.symbol;
    }
    
    /**
    * @generated
    */
    public char setSymbol(char symbol) {
        this.symbol1 = symbol;
        proof();
        return '0';
    }
    
    /**
    * @generated
    */

    public boolean proof(){
        boolean rv = false;
        if(!Objects.equals(this.symbol, this.symbol1)){
            this.symbol = symbol1;
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
