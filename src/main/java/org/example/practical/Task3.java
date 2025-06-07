package org.example.practical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("suren", "anna", "ani", "narek"));
        Collections.sort(names);
        System.out.println(names);

        Collections.reverse(names);
        System.out.println(names);

        String maxName = "";
        for (String name : names) {
            if (name.length() >= maxName.length()) {
                maxName = name;
            }
        }
        System.out.println(maxName);
    }
}
