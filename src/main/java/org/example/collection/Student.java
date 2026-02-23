package org.example.collection;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "of")
public class Student implements Comparable<Student>{

    private int rank;
    private String name;
    private int id;



    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getRank(),o.getRank());
    }
}
