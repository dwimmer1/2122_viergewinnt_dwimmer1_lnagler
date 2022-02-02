package com.example.viergewinnt_dwimmer1_lnagler1.controller;


import com.example.viergewinnt_dwimmer1_lnagler1.modell.GameField;
import com.example.viergewinnt_dwimmer1_lnagler1.view.GameFieldView;

import java.util.Scanner;

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
        String[][] field = game.getFieldXY();

        GameFieldView view = new GameFieldView();
        view.showGameField(field);

        System.out.println("Wo woln sie einwerfen????");
        try {
            //1 - 7
            while (true) {
                Scanner c = new Scanner(System.in);
                int s = c.nextInt();
                if (s <= 7) {
                    //von unten nach oben
                    for (int i = field[s].length - 1; i >= 0; i--) {
                        //setzt 0 wenn String # ist
                        if (!field[i][s].equals("0")) {
                            field[i][s] = "0";
                            break;
                        }
                    }
                }
                //du huansohn kumm zruck wixxaaaaaa
                view.showGameField(field);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

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
