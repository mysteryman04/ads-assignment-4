import java.util.Random;

public class MyTestingClass {
    private int SSN;
    private String brand;

    public MyTestingClass(int SSN, String brand) {
        this.SSN =SSN;
        this.brand =brand;
    }

    public int hashCode() {
        int SSN =17;
        SSN =31* SSN + this.SSN;
        SSN =31* SSN + brand.hashCode();
        return SSN;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN() {
        this.SSN = SSN;
    }

    public String getBrand() {
        return brand;
    }

    public void  setBrand() {
        this.brand = brand;
    }

    public static void main(String[] args) {

        MyTestingClass obj1 = new MyTestingClass(1, "IPhone");
        MyTestingClass obj2 = new MyTestingClass(2, "Xiaomi");
        MyTestingClass obj3 = new MyTestingClass(3, "Oneplus");

        System.out.println(obj1.getBrand() + " (SSN: " + obj1.hashCode() + ")");
        System.out.println(obj2.getBrand() + " (SSN: " + obj2.hashCode() + ")");
        System.out.println(obj3.getBrand() + " (SSN: " + obj3.hashCode() + ")");

        MyHashTable<MyTestingClass, Phone> table = new MyHashTable<>();
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(rand.nextInt(1000), "brand" + i);
            Phone value = new Phone("phone" + i, i % 5 + 1);
            table.put(key, value);
        }

        MyTestingClass lookupKey = new MyTestingClass(1, "IPhone");
        Phone lookupValue = table.get(lookupKey);
        if (lookupValue != null) {
            System.out.println("Found: " + lookupValue);
        } else {
            System.out.println("Not found.");
        }

        MyTestingClass removeKey = new MyTestingClass(2, "Xiaomi");
        Phone removedValue = table.remove(removeKey);
        if (removedValue != null) {
            System.out.println("Removed: " + removedValue);
        } else {
            System.out.println("Key not found.");
        }

        Phone searchValue = new Phone("phone5", 3);
        boolean containsValue = table.contains(searchValue);
        System.out.println("Contains value: " + containsValue);

        MyTestingClass searchKey = table.getKey(searchValue);
        if (searchKey != null) {
            System.out.println("Key for value " + searchValue + ": " + searchKey);
        } else {
            System.out.println("Value not found.");
        }
    }
}
