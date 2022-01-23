package com.nime;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileSaver implements ISavable {
    private FileWriter fileToWrite = null;

    public FileSaver() throws IOException {
        fileToWrite = new FileWriter("dummyFile.txt");
    }

    @Override
    public void writeToFile(ArrayList<String> myList) {
        for (String value : myList) {

        }

    }

    @Override
    public void readFile() {
        // TODO Auto-generated method stub

    }

}
