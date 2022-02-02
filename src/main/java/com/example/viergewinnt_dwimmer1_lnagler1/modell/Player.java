package com.example.viergewinnt_dwimmer1_lnagler1.modell;


import java.util.Objects;

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

        return name;
    }
    
    /**
    * @generated
    */
    public boolean setName(String name) {
        this.name1 = name;
        System.out.println(rv);
        if(proof()){
            Player.name = name1;
            return true;
        }
        return false;
        //TODO In View diese Method mit einem sout auftrufen
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
