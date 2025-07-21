package org.example.FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<Integer> consumer= (x)-> System.out.println((x+x));
        Consumer<Integer> con=(num)-> {
            System.out.println(num);

        };
        con.accept(20);
        consumer.accept(5);


    }
}
