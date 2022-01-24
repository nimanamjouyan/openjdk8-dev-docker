package com.nime;

import java.util.ArrayList;

public interface ISavable {
    void writeToFile(String fileName);

    void readFile(String fileName);
}
