package com.nime;

import java.util.ArrayList;

public interface ISavable {
    void writeToFile(ArrayList<String> myList);

    void readFile();
}
