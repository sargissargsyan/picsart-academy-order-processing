package org.example.practical;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    // "anna", "ani", "narek"

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("suren", "anna", "ani", "narek"));
        for (int i = 0; i < names.size(); i++) {
            String upperCaseName = names.get(i).toUpperCase();
            names.set(i, upperCaseName);
        }

        //version2
        for(String name : names) {
            int index = names.indexOf(name);
            String upperCaseName = name.toUpperCase();
            names.set(index, upperCaseName);
            names.set(names.indexOf(name), name.toUpperCase());

        }

    }
}
