public class MyHashTable<K, V> {
    private class HashNode<K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key +" "+ value + "}";
        }
    }
    private HashNode<K, V> [] chainArray; // or Obiect
    private int M = 11; // derault number o† chains
    private int size;

    public MyHashTable() {
        this.chainArray = new HashNode[M];
        this.size = 0;
    }

    public MyHashTable(int M) {
        this.M = M;
        this.chainArray = new HashNode[M];
        this.size = 0;
    }
    private int hash (K key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }
    public void put (K key, V value) {
        int index = hash(key);
        HashNode<K, V> node = chainArray[index];
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        node = new HashNode<K, V>(key, value);
        node.next = chainArray[index];
        chainArray[index] = node;
        size++;
    }
    public V get (K key) {
        int index = hash(key);
        HashNode<K, V> node = chainArray[index];
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }
//    public V remove (K key) {}
//    public boolean contains (V value) {}
//    public K getKey (V value) {}
}

