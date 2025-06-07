package org.example.practical;

import java.lang.reflect.Array;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, -3, 7, -1, 0, 5));
        //remove negative values
        numbers.removeIf(n -> n < 0);
        System.out.println(numbers);

        //print minimum and maximum values
        Collections.sort(numbers);
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());

        //print minimum and maximum values
        System.out.println("Min is:" + Collections.min(numbers));
        System.out.println("Max is:" + Collections.max(numbers));

        //print minimum and maximum values
        TreeSet<Integer> numbersTreeSet = new TreeSet<>(numbers);
        System.out.println("Min is: " + numbersTreeSet.first());
        System.out.println("Max is: " + numbersTreeSet.last());
    }
}
