package com.learn.patterns.temp;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheTest {

    public static void main(String[] args) {
        int size = 3;
        LRUCache<String, String> map = new LRULinkedHashMapImpl<>(3);
        map.put("a", "a");
        map.put("b", "b");
        map.get("a");
        map.put("c", "c");

        map.put("d", "d");

        // e d c a
        map.put("e", "e");
        //map.remove("a");

        System.out.println(map);

        map.getAll().forEach(kv -> System.out.println(kv.key + " " + kv.val));

    }

}
