package com.practiceKotlin.lec07;

<<<<<<< HEAD
=======
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

>>>>>>> origin/master
public class Lec07Main {
    public static void main(String[] args) {

    }
<<<<<<< HEAD

    public int max(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }

    public static void repeat(String str, int num, boolean useNewLine) {
        for(int i=1; i<=num; i++){
            if(useNewLine) {
                System.out.println(str);
            } else{
                System.out.print(str);
            }
        }
    }

    public void repeat(String str, int num){
        repeat(str, num, true);
    }

    public void repeat(String str){
        repeat(str, 3, true);
    }

    public static void printAll(String... strings){
        for(String str : strings){
            System.out.println(str);
        }
    }

=======
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
>>>>>>> origin/master
}
