package com.example.viergewinnt_dwimmer1_lnagler1.controller;


import com.example.viergewinnt_dwimmer1_lnagler1.modell.GameField;

/**
* @generated
*/
public class GameController {
    
    /**
    * @generated
    */
    private Integer randStarter;

    public static void main(String[] args) {

        GameField game = new GameField();

       game.SetXY();

    }
    
    
    /**
    * @generated
    */
    public Integer getRandStarter() {
        return this.randStarter;
    }
    
    /**
    * @generated
    */
    public Integer setRandStarter(Integer randStarter) {
        this.randStarter = randStarter;

        return 0;
    }
    
    
}
