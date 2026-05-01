package Lab11_Tasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task04 {
    public static <T extends Number & Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static double sum(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) {
            total += n.doubleValue();
        }
        return total;
    }

    public static <T extends Number & Comparable<T>> T max(List<T> list) {
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7));
        sortList(list);
        System.out.println("Sorted List : " + list);
        System.out.println("Sum : " + sum(list));
        System.out.println("Max : " + max(list));
    }
}
