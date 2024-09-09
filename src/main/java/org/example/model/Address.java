package org.example.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "of")
public class Address {

    private String city;
    private String state;
    private String country;
}
