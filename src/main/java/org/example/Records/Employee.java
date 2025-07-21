package org.example.Records;

import java.time.Period;

public record Employee(String name , int age ) {

        public Employee {
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or more");
            }
        }

    public static void main(String[] args) {

        Employee employee=new Employee("Rohit Sharma ", 36);
    }
}
