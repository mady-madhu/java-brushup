package org.example.clone;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "of")
public class Address  implements  Cloneable{

    private String city;
    private String state;
    private String country;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
