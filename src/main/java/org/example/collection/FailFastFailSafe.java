package org.example.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

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
        list.add("O");
        //list.stream().sorted(Comparator.reverseOrder());

       /* System.out.println(list);
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();
            if ("B".equals(value)) {
                iterator.remove(); // Structural modification
            }
        }*/

       System.out.println(list);
       usingForLoop(list);
       usingForEach(list);
    }

    public static void usingForLoop(List list){
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals("B")){
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
    }

    public static void usingForEach(List<String> list){
        for(String str: list){
           if(str.equals("O")){
               list.remove(str);
           }
        }
        System.out.println(list);
    }


}
