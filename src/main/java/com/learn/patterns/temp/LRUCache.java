package com.learn.patterns.temp;

import java.util.List;

public interface LRUCache<K, V> {
    V put(K key, V value);
    V get(K key);
    V remove(K key);

    List<KeyVal<K, V>> getAll();


}
