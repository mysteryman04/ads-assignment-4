public class MyHashTable<K, V> {
    private class HashNode<K, V> {
    }
    private HashNode<K, V> [] chainArray; // or Obiect
    private int M = 11; // derault number o† chains
    private int size;

    public MyHashTable() {}

    public MyHashTable(int M) {}
    private int hash (K key) {}
    public void put (K key, V value) {}
    public V get (K key) {} public V remove (K key) {}
    public boolean contains (V value) {}
    public K getKey (V value) {}
}

