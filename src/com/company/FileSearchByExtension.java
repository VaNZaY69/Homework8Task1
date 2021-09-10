package com.company;

import java.io.File;
import java.util.*;

class FileSearchByExtension {
    List<File> fileList = new ArrayList<>();

    public void findFiles(File file, String ext) {

        if (!file.exists()) System.out.println(file + " папка не существует");

        searchFile(file, ext);

        if (fileList.size() == 0) {
            System.out.println(file + " в данном репозитории нет файлов с расширением " + ext);
        }
    }

    private void searchFile(File file, String ext) {
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            for (File child : children) {
                if (child.isFile() && child.getName().toLowerCase().endsWith(ext)) {
                    this.fileList.add(child);
                    System.out.println("В данном репозитории по пути " + file
                            + " Найден файл: "+ child.getName());
                }
                if (child.isDirectory()) {
                    this.searchFile(child, ext);
                }
            }
        }
    }
}
