package com.example.collections;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {

//    Creating an Enum
    public enum Days {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    };

    public static void main(String[] args) {
        EnumMap<Days,String> mapExample = new EnumMap<>(Days.class);
        mapExample.put(Days.Sunday, "1");
        mapExample.put(Days.Monday, "2");
        mapExample.put(Days.Tuesday, "3");
        mapExample.put(Days.Wednesday, "4");
        mapExample.put(Days.Thursday, "5");
        mapExample.put(Days.Friday, "6");
        mapExample.put(Days.Saturday, "7");

        for (Map.Entry map: mapExample.entrySet()) {
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}
