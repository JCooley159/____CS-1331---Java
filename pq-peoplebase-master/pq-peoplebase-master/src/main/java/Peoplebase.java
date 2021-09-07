public class Peoplebase {

    private Person[] people;

    public Peoplebase(Person ... _people) {
        this.people = _people;
    }

    public Person findByName(String inName) {
        for(Person p : people) {
            String name = p.getName();
            if (name.equals(inName)) {
                return p;
            }
        }
        return null;
    }

    public Person findByHomeTown(String inHomeTown){
        for(Person h : people) {
            String hometown = h.getHomeTown();
            if (hometown.equals(inHomeTown)) {
                return h;
            }
        }
        return null;
    }
}
