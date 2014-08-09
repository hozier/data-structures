package com.ephemeral;

/**
 * Created by MDCCLXXVI on 7/15/14.
 */
public class Bug {

    private int walk;
    private String directional;


    Bug(int initialPosition){
        walk = initialPosition;
        directional = "right";
    }

    public  void move(){
        if(directional.equals("right")){
            walk++;
        }
        else walk --;
    }

    public void turn(){
        if(directional.equals("right")){
            directional = "left";
        }
        else {directional = "right";}
    }

    public String getDirectional() {
        return directional;
    }

    public int getWalk() {

        return walk;
    }


}
