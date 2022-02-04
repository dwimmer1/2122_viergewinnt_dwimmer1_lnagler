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
        String[] decision = {
                "Ist schon vergeben",
                "Ist eingelockt"
        };
        if(proof()){
           return decision[0];
        }else{
            return decision[1];
        }
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
