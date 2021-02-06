package com.learn.patterns.temp;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LRULinkedHashMapImpl<K, V> implements LRUCache<K, V>{
    private int capacity;
    private LinkedHashMap<K, V> map;

    public LRULinkedHashMapImpl(int capacity){
        this.capacity = capacity;
        this.map = new LinkedHashMap<>(capacity, 0.75f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }
        } ;
    }

    @Override
    public V put(K key, V value) {
        return map.put(key, value);
    }

    @Override
    public V get(K key) {
        return map.get(key);
    }

    @Override
    public V remove(K key) {
        return map.remove(key);
    }

    @Override
    public List<KeyVal<K, V>> getAll() {
        return map.entrySet().stream().map(kvEntry -> new KeyVal<K, V>(kvEntry.getKey(), kvEntry.getValue())).collect(Collectors.toList());
    }

}
