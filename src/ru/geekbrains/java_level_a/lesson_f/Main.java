package ru.geekbrains.java_level_a.lesson_f;

import java.io.*;

public class Main {
    private static String firstFileName = "FileNumberOne.txt";
    private static String secondFileName = "FileNumberTwo.txt";
    private static String textWriteToFirstFile = "Creates a file output stream to write to the file with the specified";
    private static String textWriteToSecondFile = "If the file exists but is a directory rather than a regular file, does";

    public static void main(String[] args) throws IOException {
        writeFile(firstFileName, textWriteToFirstFile);
        writeFile(secondFileName, textWriteToSecondFile);
        concatenationTextFiles(firstFileName, secondFileName);
        System.out.println(findStringInFile(firstFileName, "output")?
                "Найдено" : "Не найдено");
        System.out.println(findWordInDir("regular")? "Найдено" : "Не найдено");
    }

    public static void writeFile(String fileName, String textToWrite) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(textToWrite.getBytes());
        fos.close();
    }

    public static void concatenationTextFiles(String firstFile, String secondFile) throws IOException {
        FileInputStream fisOne = new FileInputStream(firstFile);
        FileInputStream fisTwo = new FileInputStream(secondFile);
        String resultConcatenation = String.valueOf(fileToString(fisOne)) + fileToString(fisTwo);
        System.out.println(resultConcatenation);
        fisOne.close();
        fisTwo.close();
    }

    private static StringBuilder fileToString(FileInputStream file) throws IOException {
        String firstString = "";
        StringBuilder sb = new StringBuilder(firstString);
        int b;
        while ((b = file.read()) != -1) {
            sb.append((char) b);
        }
        sb.append("\n");
        return sb;
    }

    public static boolean findStringInFile(String file, String searchWord) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = fis.read()) != -1) {
            sb.append((char) b);
        }
        String searchBar = String.valueOf(sb);
        return (searchBar.contains(searchWord));
    }

    public static boolean findWordInDir (String searchWord) throws IOException {
        File dir = new File(".");
        for(int i = 0; i < dir.list().length; i ++){
            if(dir.list()[i].endsWith(".txt"))
                if(findStringInFile(dir.list()[i], searchWord )) return true;;
        }
        return false;
    }
}
