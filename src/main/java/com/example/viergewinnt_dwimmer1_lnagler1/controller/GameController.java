package com.example.viergewinnt_dwimmer1_lnagler1.controller;


import com.example.viergewinnt_dwimmer1_lnagler1.modell.Player;
import com.example.viergewinnt_dwimmer1_lnagler1.view.PlayerView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

/**
 * @generated
 */
public class GameController {
    public static void main(String[] args) throws IOException {
        PlayerView createPl1 = new PlayerView();
        PlayerView createPl2 = new PlayerView();
        Player Player1 = new Player();
        Player Player2 = new Player();

        do {
            InputStreamReader pl1 = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(pl1);
            createPl1.createPlayer();
            String eingabe = br.readLine();
            Player1.setName(eingabe);
            System.out.println(eingabe);
        } while (Player.rv);
        do {
            InputStreamReader pl2 = new InputStreamReader(System.in);
            BufferedReader br1 = new BufferedReader(pl2);
            createPl2.createPlayer();
            String eingabe1 = br1.readLine();
            Player2.setName(eingabe1);
            System.out.println(eingabe1);
        } while (Player.rv);

    }

    /**+
     * @generated
     */
    private Integer randStarter;


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
