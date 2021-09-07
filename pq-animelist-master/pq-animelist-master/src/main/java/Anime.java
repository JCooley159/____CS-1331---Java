// TODO: Implement an appropriate interface to impose an ordering on Anime
public class Anime implements Comparable<Anime> {
    private String name;
    private int yearOfProduction;

    public Anime(String name, int yearOfProduction) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
    }

    public String getName() {
        return name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String toString() {
        return name + " : " + yearOfProduction;
    }

    /*
     * TODO: YOUR CODE BELOW
     * Fill out the return type and method body
     * This method should compare animes based on their name.
     **/

     @Override
     public int compare(Anime this, Anime other) {
         return this.getName().compareTo(other.getName()); 
     }

     @Override
     public int compareTo(Anime other) {
         return this.getName().compareTo(other.getName());
     }

}
