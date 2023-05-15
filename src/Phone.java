public class Phone {
    private String name;
    private int id;

    public Phone(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " (Grade " + id + ")";
    }
}
