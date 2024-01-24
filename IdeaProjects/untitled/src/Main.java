

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.*;

public class Main {
    static List<String> listOfNames = new ArrayList<>();
    public static void main(String[] args) {
            // insert a list of strings, and it'll ordenate them based on their
        // alphabethic order.
        System.out.println("How many names do you wish to add?");
        Scanner objNames = new Scanner(System.in);
        int k = objNames.nextInt();
        objNames.nextLine();
        for (int i = 1; i <= k; i++){
            System.out.println(String.format("%d: Name: ", i));
            String tempName = objNames.nextLine();
            addName(tempName);
        }
        objNames.close();
        //sorting the names based of their names
        Collections.sort(listOfNames, new CompareByAlphabethicOrder());
        System.out.println("The names in order are: " + listOfNames);
    }
    public static void addName(String name) {
        listOfNames.add(name);
    }
    public static class CompareByAlphabethicOrder implements Comparator<String>{
        public int compare(String e, String e1){
            return e.compareTo(e1);
        }
    }
}

