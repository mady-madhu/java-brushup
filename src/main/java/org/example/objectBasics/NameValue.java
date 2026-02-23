package org.example.objectBasics;

import java.util.NavigableMap;

public class NameValue {

    String name;
    String country;

    public  NameValue(String name,String country){
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "NameValue{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public void changeMe(NameValue nv){
        NameValue temp = nv;
        nv = new NameValue("country","Canada");
        System.out.println(nv);
    }

    public static void main(String[] args) {
        NameValue test = new NameValue("country","USA");
        System.out.println(test);
        test.changeMe(test);
        System.out.println(test);
    }
}
