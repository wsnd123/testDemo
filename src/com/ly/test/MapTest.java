package com.ly.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            map.put(i, "tom" + i);
        }
        long stop2 = System.currentTimeMillis();
        System.out.println("map put times:" + (stop2 - start2) + "ms");

        long start1 = System.currentTimeMillis();
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Integer key = iterator1.next().getKey();
            String value = iterator1.next().getValue();
        }
        long stop1 = System.currentTimeMillis();
        System.out.println("entrySet times:" + (stop1 - start1) + "ms");

        long start = System.currentTimeMillis();
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            String integer = map.get(next);
        }
        long stop = System.currentTimeMillis();
        System.out.println("keySet times:" + (stop - start) + "ms");


    }
}
