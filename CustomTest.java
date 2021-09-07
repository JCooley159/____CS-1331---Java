public class CustomTest {
    Person a, b, c, d;
    Peoplebase pbase;
    
    CustomTest() {
        a = new Person("Superman", "Krypton");
        b = new Person("Thor", "Asgard");
        c = new Person("Batman", "Gotham");
        d = new Person("Peter Parker", "NYC");
        pbase = new Peoplebase(a,b,c,d);
    }

    public void execute(){
        System.out.println("To strings - ");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println("Finding Batman - " + pbase.findByName("Batman"));
        System.out.println("Finding NYC - " + pbase.findByHomeTown("NYC"));
    }

    public static void main(String...args) {
        CustomTest test = new CustomTest();
        test.execute();
    }
}
