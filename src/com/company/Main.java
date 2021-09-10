package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        FileSearchByExtension search = new FileSearchByExtension();
        search.findFiles(new File("./"), ".java");
    }
}
