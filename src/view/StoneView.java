package view;


import java.util.Scanner;


public class StoneView {

    /**
     * Funktionsbeschreibung
     *printet Stone symbol
     * @param    d print stone
     * @return 	string
     */
    public String createStone(String d) {

        System.out.println(d);

        return "";
    }

    /**
     * Funktionsbeschreibung
     * gibt aus das Name bereits benutzt wurde
     * @return 	void
     */
    public void vorhanden(){
        System.out.println("Ist schon vergeben");

    }


    /**
     * Funktionsbeschreibung
     *printet welchen stein man haben will
     * @param    stones stone symbole
     * @return 	void
     */
        public void showStone(Character[] stones) {
            System.out.println("Welchen Stein wollen Sie?");
            System.out.println("[0] " + stones[0] + "\n" + "[1] " + stones[1]);
        }

}
