public class Phone {
    private String brand;
    private int SSN;

    public Phone(String brand, int SSN) {
        this.brand = brand;
        this.SSN = SSN;
    }

    public String getBrand() {
        return brand;
    }

    public int getSSN() {
        return SSN;
    }

    @Override
    public String toString() {
        return brand + " (SSN " + SSN + ")";
    }
}
