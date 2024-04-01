package com.practiceKotlin.lec02;

import jakarta.annotation.Nullable;
import org.jetbrains.annotations.NotNull;

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Nullable
    public String getName(){
        return name;
    }
}
