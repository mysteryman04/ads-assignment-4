public class Main {
    public static void main(String[] args) {
        MyHashTable<String, Integer> hashTable = new MyHashTable<>();
        hashTable.put("iphone", 3);
        hashTable.put("samsung", 2);
        hashTable.put("oneplus", 5);
        hashTable.remove("iphone");
        System.out.println(hashTable.get("samsung"));
        System.out.println(hashTable.get("oneplus"));
        System.out.println(hashTable.get("iphone"));
        System.out.println(hashTable.contains(3));
        System.out.println(hashTable.contains(5));

    }
}