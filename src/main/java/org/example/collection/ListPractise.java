package org.example.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractise {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(3,4,5);

       //Create a new list to store common elements
        List<Integer> commonElements = new ArrayList<>(list1);

        // Retain only elements that are also in list2
        commonElements.retainAll(list2);


        System.out.println(list1);
        System.out.println(list2);
        //System.out.println(commonElements);
    }
}
