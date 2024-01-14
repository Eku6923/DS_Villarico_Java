import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayVill {
    public static void main(String[] args) {
        Integer[] numberArray = {0, 1, 2, 3, 4, 5};
        int arrayLength = numberArray.length;

        ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(numberArray));
        numberList.add(6);

        for (int i = 0; i < numberList.size(); i++) {
            System.out.println(numberList.get(i));
        }

        // Add these lines after adding a new element to the ArrayList
        Iterator<Integer> ListElement = null;
        ListElement = numberList.listIterator();

        // Replace your loop with a recursive method
        recur(ListElement);
    }

    // Define the recursive method
    static void recur(Iterator<Integer> ListE) {
        if (ListE.hasNext()) {
            Integer nextElement = ListE.next();
            System.out.println(nextElement);
            recur(ListE);
        }
    }
}