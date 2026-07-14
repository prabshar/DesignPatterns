package DesignPattern.IteratorPattern;

import java.util.HashMap;
import java.util.Map;

public class MapIterator<K,V> implements Iterator<Map.Entry<K, V>> {
    Map<K, V> map = new HashMap<>();
    int index = 0;
    Object[] keys;

    public MapIterator(Map<K, V> map) {
        this.map = map;
        this.keys = map.keySet().toArray();
    }

    @Override
    public boolean hasNext() {
        return index < keys.length;
    }

    @Override
    public Map.Entry<K, V> next() {
        K key = (K) keys[index++];
        return new HashMap.SimpleEntry<>(key, map.get(key));
    }
}
