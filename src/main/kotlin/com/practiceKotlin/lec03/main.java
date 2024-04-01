package com.practiceKotlin.lec03;

import com.practiceKotlin.lec02.Person;

public class main {
    public static void main(String[] args) {

    }

    public static void printAgeIfPerson(Object obj){
        if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getName());
        }
    }

}
