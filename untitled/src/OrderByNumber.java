import java.util.*;
public class OrderByNumber {
    List<Integer> array = new ArrayList<>();
    public void addElement(int num){
        array.add(num);
    }
    public void removeElement(int num){
        array.remove(num);
    }
    public void sortNumbers(){
        Collections.sort(array, new ComparatorByOrderOfNumber());
    }
    public class ComparatorByOrderOfNumber implements Comparator<Integer>{
        public int compare(Integer e, Integer e1){
            return Integer.compare(e,e1);
        }
    }
    public void displayNums(){
        System.out.println(array);
    }
}
