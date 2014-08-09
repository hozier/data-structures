package com.collect;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by MDCCLXXVI on 8/2/14.
 */
public class MapDemo {

    private static Map<String, Integer> salinger = new HashMap<String, Integer>();
    private static Map<String, Color> hemingway = new TreeMap<String, Color>();

    public static void main(){
        hemingway.put("Woody", Color.blue);
        hemingway.put("Bud", Color.DARK_GRAY);
        hemingway.put("Mr. Potato", Color.yellow);
        hemingway.put("Sally", Color.blue);

        Set<String> keySet = hemingway.keySet();

        for(String a_Key: hemingway.keySet()){
            System.out.printf("[key=%s][color=%s]", a_Key,hemingway.get(a_Key));
        }
    }
}
