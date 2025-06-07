package org.example;

import java.util.HashSet;
import java.util.Vector;

public class Main1 {
        public static void main(String[] args) {
            Vector<String> set = new Vector<>(2);
            System.out.println(set.size());

            set.add("Apple");
            set.add("Banana");
            set.add("Cherry");
            set.add("Apple");  // Կրկնվողը չի ավելացվի
            System.out.println(set.size());
            System.out.println(set); // [Banana, Apple, Cherry] (կարգը պատահական է)
            set.add("asaApple");
            set.add("sasBanana");

            System.out.println(set.size());
            System.out.println(set); // [Banana, Apple, Cherry] (կարգը պատահական է)
        }

}
