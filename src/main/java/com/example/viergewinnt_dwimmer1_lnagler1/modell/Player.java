package com.example.viergewinnt_dwimmer1_lnagler1.modell;


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
    private String name1;

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
            Player.name = null;
        }else{
            Player.name = name1;
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
