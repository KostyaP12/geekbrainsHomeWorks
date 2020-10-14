package ru.geekbrains.java_level_b.lesson_c;

import java.util.*;

public class Main {
    public static String verse =
            "В лесу родилась ёлочка\n" +
            "В лесу она росла\n" +
            "Зимой и летом стройная\n" +
            "Зелёная была\n" +
            "Метель ей пела песенку\n" +
            "\"Спи ёлочка, бай-бай!\"\n" +
            "Мороз снежком укутывал:\n" +
            "\"Смотри, не замерзай!\"";

    public static void main(String[] args) {
        ArrayList<String>verseList = stringToList(verse);
        HashSet<String>verseHash = new HashSet<>(verseList); // список слов
        HashMap<String, Integer>verseMap = new HashMap<String, Integer>();
        wordCount(verseList, verseMap);  // количество слов
        PhoneBook phoneBook = new PhoneBook("9999999", "fsdfsd", "Smith");
        System.out.println(phoneBook.phonebook);

    }

    private static void wordCount(ArrayList<String> verseList, HashMap<String, Integer> verseMap) {
        for(int i = 0; i < verseList.size(); i++){
            int value = Collections.frequency(verseList, verseList.get(i));
            verseMap.put(verseList.get(i), value);
        }
    }

    public static ArrayList stringToList(String verse){
        ArrayList<String> tmpList = new ArrayList<>();
        for (String string  : verse.split("\n")) {
            for (String tmp : string.split(" ")) {
                tmpList.add(tmp);
                }
            }
        return tmpList;
        }
}
