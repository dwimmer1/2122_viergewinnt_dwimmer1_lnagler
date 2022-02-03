package modell;


import view.PlayerView;  // TODO Wittner: ???

import java.util.Objects;
import java.util.Random;

/**
 * @generated
 */
public class Player extends Stone{

    /**
     * @generated
     */
    private static String name;
    public static boolean rv = true;
    private String name1;   // TODO Wittner: wieso hat ein Spieler zwei Namen??????

    /**
     * @generated
     */




    /**
     * @generated
     */
    public String getName() {

        return name1;
    }

    /**
     * @generated
     */
    public String setName(String name) {
        this.name1 = name;
        if(proof()){
            PlayerView pl = new PlayerView();   // TODO Wittner: NEIN!!!!! Die Model Klasse Player, darf auf keinen Fall Zugriff auf die View haben!!!!!!
            pl.vorhanden();
        }else{
            Player.name = name1;    // TODO Wittner: WAS soll den hier passieren?! das darf man so nicht lösen!!!
                                    //     das müssen wir noch besprechen
        }

        return Player.name;
        //TODO In View diese Method mit einem sout auftrufen
    }

    public String startPlayer(){
        Random rand = new Random();
        int value = rand.nextInt(2);
        System.out.println(value);

        return "";
    }
    /**
     * @generated
     */
    public boolean proof() {
        if(!Objects.equals(this.name1, name)){
            name = name1;
            rv = false;
        }else{
            rv = true;
        }
        return rv;
        //TODO
    }
}
