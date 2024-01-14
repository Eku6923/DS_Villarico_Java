import java.util.Arrays;
import java.util.ArrayList;
 
public class ArrayVill {
    public static void main(String[] args) {
        
        Integer[] numberArray = {0, 1, 2, 3, 4, 5};
        int arrayLength = numberArray.length;
              
        
        ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(numberArray));
        numberList.add(6);
        
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println(numberList.get(i));
        }
    }
}