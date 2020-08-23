import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> intListSort = filterEvenNumbers(filterPositiveNumbers(intList));
        Collections.sort(intListSort);
        System.out.println(intListSort);
    }

    public static List<Integer> filterPositiveNumbers(List<Integer> intList) {
        List<Integer> intListFilterPositiveNumbers = new ArrayList<>();
        for (Integer number : intList) {
            if (number > 0) {
                intListFilterPositiveNumbers.add(number);
            }
        }
        return intListFilterPositiveNumbers;
    }

    public static List<Integer> filterEvenNumbers(List<Integer> intListFilterPositiveNumbers) {
        List<Integer> intListNumberEven = new ArrayList<>();
        for (Integer number : intListFilterPositiveNumbers) {
            if (number % 2 == 0) {
                intListNumberEven.add(number);
            }
        }
        return intListNumberEven;
    }
}
