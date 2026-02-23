package org.example.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    /*public static void main(String args[]) {
            int[] numbers ={3,2,7,1,4,8};
            Arrays.sort(numbers);
            System.out.println(Arrays.toString(numbers));
            int expected = numbers[0];
            for(int i=numbers[0];i<numbers[numbers.length-1];i++){
                if(i != expected){

                }
            }
        }*/


    public static void main(String[] args) {
        Student s1= Student.of(20,"abc",1001);
        Student s2= Student.of(10,"cdb",1021);
        Student s3= Student.of(30,"hello",1031);

        List<Student> students = List.of(s1, s2, s3);

        Student student = students.stream().sorted().findFirst().orElseGet(null);
        System.out.println(student);
    }
}
