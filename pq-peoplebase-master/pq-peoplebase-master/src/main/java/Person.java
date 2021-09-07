public class Person {

    private String name;
    private String hometown;

    public Person(String _name, String _hometown) {
        this.name = _name;
        this.hometown = _hometown;
    }

    public String toString() {
        return name + " from " + hometown;
    }

    public String getName() {
        return name;
    }

    public String getHomeTown() {
        return hometown;
    }
}
