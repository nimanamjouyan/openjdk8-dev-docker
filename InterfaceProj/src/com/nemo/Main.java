package com.nemo;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        FileSaver fileSaver = new FileSaver();
        fileSaver.readFile("./InterfaceProj/src/com/nime/readingTest.txt");
        System.out.println(fileSaver.toString());
        fileSaver.writeToFile("InterfaceProj/src/com/nime/writingTest.txt");

    }
}
