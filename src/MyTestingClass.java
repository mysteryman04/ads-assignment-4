
public class MyTestingClass {
    private int SSN;
    private String brand;

    public MyTestingClass(int id, String name) {
        this.SSN =id;
        this.brand =name;
    }

    public int hashCode() {
        int result=17;
        result=31*result+ SSN;
        result=31*result+ brand.hashCode();
        return result;
    }

    public int getSSN() {
        return SSN;
    }

    public void setId() {
        this.SSN = SSN;
    }

    public String getBrand() {
        return brand;
    }

    public void  setBrand() {
        this.brand = brand;
    }

    public static void main(String[] args) {

    }
}
