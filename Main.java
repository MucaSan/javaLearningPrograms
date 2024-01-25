

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.*;

public class Main {
    public static void main(String[] args) {
          OrderByNumber objListNumber = new OrderByNumber();
          System.out.println("Insert how many numbers you want to display: ");
          Scanner objNumOfTimes = new Scanner(System.in);
          int k = objNumOfTimes.nextInt();
          objNumOfTimes.nextLine();

          for (int i = 1 ; i <= k ; i++){
              System.out.println(String.format("%d: Number is: ", i));
              int tempNum = objNumOfTimes.nextInt();
              objListNumber.addElement(tempNum);
          }
          objListNumber.sortNumbers();
          objListNumber.displayNums();
    }
}

