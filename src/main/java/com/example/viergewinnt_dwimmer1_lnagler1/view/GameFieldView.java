package com.example.viergewinnt_dwimmer1_lnagler1.view;


/**
* @generated
*/
public class GameFieldView {
    
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
     *  System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
     *         System.out.println("|\t#\t#\t#\t#\t#\t#\t#\t|");
     *         System.out.println("|\t#\t#\t#\t#\t#\t#\t#\t|");
     *         System.out.println("|\t#\t#\t#\t#\t#\t#\t#\t|");
     *         System.out.println("|\t#\t#\t#\t#\t#\t#\t#\t|");
     *         System.out.println("|\t#\t#\t#\t#\t#\t#\t#\t|");
     *         System.out.println("|\t#\t#\t#\t#\t#\t#\t#\t|");
     *         System.out.println("---------------------------------");
     * zeigt gameField
    */
    public void showGameField(String[][] field) {
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {

                System.out.print( "\t" + field[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");

    }
    
}
