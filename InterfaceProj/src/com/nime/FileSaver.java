package com.nime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileSaver implements ISavable {
    private ArrayList<String> buffer = new ArrayList<>();

    @Override
    public void readFile(String fileName) {
        try (BufferedReader bufferedFile = new BufferedReader(new FileReader(fileName))) {
            String input;
            while ((input = bufferedFile.readLine()) != null) {
                buffer.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeToFile(String fileName) {
        try (BufferedWriter bufferedFile = new BufferedWriter(new FileWriter(fileName))) {
            for (String value : buffer) {
                bufferedFile.write(String.format("%s\n", value));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
