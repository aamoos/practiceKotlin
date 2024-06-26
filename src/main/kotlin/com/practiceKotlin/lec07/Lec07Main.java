package com.practiceKotlin.lec07;

import org.jetbrains.annotations.NotNull;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lec07Main {
    public static void main(String[] args) {

    }

    private int parseIntOrThrow(@NotNull String str){
        try{
            return Integer.parseInt(str);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException(String.format("주어지는 %는 숫자가 아닙니다"));
        }
    }

    private Integer parseIntOrThrowV2(@NotNull String str){
        try{
            return Integer.parseInt(str);
        }catch (NumberFormatException e){
            return null;
        }
    }

    public void readFile() throws IOException {
        File currentFile = new File(".");
        File file = new File(currentFile.getAbsoluteFile() + "/a.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println(reader.readLine());
        reader.close();
    }

    public void readFile2(String path) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            System.out.println(reader.readLine());
        }
    }
}
