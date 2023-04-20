package com.ua.robot_dreams_project.home_work27;

import java.io.*;

public class WorkWithFiles {
    File file = new File("defaultText.txt");
    String initialLine = "Default line";
    String newLine = "";

    public WorkWithFiles() {
    }

    public WorkWithFiles(File file) {
        this.file = file;
    }

    public WorkWithFiles(File file, String newLine) {
        this.file = file;
        this.newLine = newLine;
    }

    void writeStringToFile() {
        try (OutputStream os = new FileOutputStream(file); OutputStreamWriter osw = new OutputStreamWriter(os)) {
            osw.write(initialLine);
            osw.append(" + ");
            osw.append(newLine);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    String readStringFromFile() {
        try (InputStream is = new FileInputStream(file)) {
            byte[] newLine = is.readAllBytes();
            String dataString = new String(newLine);
            return dataString;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void deleteFile() {
        file.delete();
    }
}
