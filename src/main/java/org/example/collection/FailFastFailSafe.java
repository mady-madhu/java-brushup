package org.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastFailSafe {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("C");
        list.add("C");
        list.add("C");

        System.out.println(list);
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();
            if ("B".equals(value)) {
                iterator.remove(); // Structural modification
            }
        }
        System.out.println(list);

    }
}
