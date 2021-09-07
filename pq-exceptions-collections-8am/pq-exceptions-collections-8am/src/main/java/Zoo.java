import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Zoo {

    private List<Animal> animals;
    private int count;

    public Zoo() {
        this.animals = new Animal[10];
    }

    public void add(Animal a) {
        animals = animals.add(a);
    }

    public List<Animal> getList() {
        return animals;
    }

    public Set<Animal> getTypes() {
        public Set<Animal> animalSet;
        for (int i = 0; i < animals.size(); i++) {
            animalSet = animalSet.add(animals[i]);
        }
    }


    public Map<Animal, Integer> getAnimalCounts(Animal[] zooSection) {
        public Map<Animal, Integer> animalCounts;
        for (int j = 0; i < zooSection.length(); j++) {
            zooSection.getTypes();
        }
    }
}
