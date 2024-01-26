import java.util.*;

// we're considering a person only has an age and a name.
public class MapOrdering {
    private Map<String, Integer>  Person;

    public MapOrdering(){
        this.Person = new HashMap<>();
    }

    public void addElement(String name, int age){
        Person.put(name,age);
    }

    public void removeElement(String name, int age) {
        for (Map.Entry<String, Integer> entry : Person.entrySet()) {
            if (entry.getKey().equals(name) && entry.getValue() == age) {
                Person.remove(entry.getKey() ,entry.getValue());
            }
        }
    }
    public Map<String,Integer> OrderByName() {
        List<Map.Entry<String, Integer>> listToBeOrdered = new ArrayList<>(Person.entrySet());
        Collections.sort(listToBeOrdered , new CompareByName());
        Person = new HashMap<>();
        for (Map.Entry<String,Integer> entry : listToBeOrdered){
            Person.put(entry.getKey(), entry.getValue());
        }
        return Person;
    }
    public class CompareByName implements Comparator<Map.Entry<String,Integer>> {
        public int compare(Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2) {
            return e1.getKey().compareTo(e2.getKey());
        }
    }
}
