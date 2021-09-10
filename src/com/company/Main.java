package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        FileSearchByExtension search = new FileSearchByExtension();
        search.findFiles(new File("D:/IdeaProjects(Save)/Homework8Task1"), ".java");
    }
}
