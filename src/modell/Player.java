package modell;


import view.PlayerView;  // TODO Wittner: ???

import java.util.Objects;
import java.util.Random;


public class Player extends Stone{


    private static String name;
    public static boolean rv = true;
    private String name1;
    private int randStarter;

    /**
     * Funktionsbeschreibung
     * bekommt namen vom Player
     * @return 	name1
     */
    public String getName() {

        return name1;
    }

    /**
     * Funktionsbeschreibung
     * setzt name für einen Spieler
     * @param    name name des Spielers
     * @return 	Player.name
     */
    public String setName(String name) {
        this.name1 = name;
        if(proof()){
            PlayerView pl = new PlayerView();
            pl.vorhanden();
        }else{
            Player.name = name1;
        }

        return Player.name;
    }


    /**
     * Funktionsbeschreibung
     * Random vom spieler start
     * @return 	String
     */
    public int getRandStarter(){
        Random rand = new Random();
        randStarter = rand.nextInt(2);

        return this.randStarter;
    }
    /**
     * Funktionsbeschreibung
     * prüft ob spieler namen doppelt sind
     * @return 	rv
     */
    public boolean proof() {
        if(!Objects.equals(this.name1, name)){
            name = name1;
            rv = false;
        }else{
            rv = true;
        }
        return rv;
    }
}
