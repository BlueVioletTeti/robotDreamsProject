package com.ua.robot_dreams_project.home_work28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.StandardOpenOption;

public class WorkWithFilesNIO {
    String fileName = "default.txt";
    Path file;
    String initialLine = "Default line";
    String newLine = "";


    public WorkWithFilesNIO() {
        create();
    }

    public WorkWithFilesNIO(String fileName, String newLine) {
        this.fileName = fileName;
        this.newLine = newLine;
        create();
    }

    public Path getFile() {
        return file;
    }

    public void setFile(Path file) {
        this.file = file;
    }

    public String getInitialLine() {
        return initialLine;
    }

    public void setInitialLine(String initialLine) {
        this.initialLine = initialLine;
    }

    public String getNewLine() {
        return newLine;
    }

    public void setNewLine(String newLine) {
        this.newLine = newLine;
    }

    void create() {
        try {
            file = Paths.get(fileName);
            if (Files.exists(file)) {
                System.out.println("File already exists: " + file.toString());
            } else {
                Path doneFile = Files.createFile(file);
                System.out.println("File is created: " + doneFile.toString());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void write() {
        try {
            Files.write(getFile(), getInitialLine().getBytes());
            Files.write(getFile(), getNewLine().getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void read() {
        try {
            List<String> data = Files.readAllLines(getFile());
            for (String s : data) {
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
