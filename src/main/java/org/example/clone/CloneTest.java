package org.example.clone;


public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e =  Employee.of(1,"aa",25,100 ,  Address.of("SLC","UT","USA"));
        Employee cloned = (Employee)e.clone();

        System.out.println(e);
        System.out.println(cloned);

        cloned.getAddress().setCity("Sandy");

        cloned.setId(2);

        System.out.println(e);
        System.out.println(cloned);

        /**
         *
         * swallow cloning output
         *
         * Employee(id=1, name=aa, age=25, salary=100, address=Address(city=SLC, state=UT, country=USA))
         * Employee(id=1, name=aa, age=25, salary=100, address=Address(city=SLC, state=UT, country=USA))
         * Employee(id=1, name=aa, age=25, salary=100, address=Address(city=Sandy, state=UT, country=USA))
         * Employee(id=2, name=aa, age=25, salary=100, address=Address(city=Sandy, state=UT, country=USA))
         *
         * Deep Cloning Output
         *
         * Employee(id=1, name=aa, age=25, salary=100, address=Address(city=SLC, state=UT, country=USA))
         * Employee(id=1, name=aa, age=25, salary=100, address=Address(city=SLC, state=UT, country=USA))
         * Employee(id=1, name=aa, age=25, salary=100, address=Address(city=SLC, state=UT, country=USA))
         * Employee(id=2, name=aa, age=25, salary=100, address=Address(city=Sandy, state=UT, country=USA))
         *
         *
         */


    }
}
