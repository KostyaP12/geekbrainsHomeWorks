package ru.geekbrains.java_level_b.lessonC;



import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

public class PhoneBook {
    private String surname;
    private String number;
    private String email;
    public ListMultimap<String, String>phonebook = ArrayListMultimap.create();

    public PhoneBook(String number,String email, String surname) {
        this.surname = surname;
        this.number = number;
        this.email = email;
        this.phonebook = getMap(surname, number, email);
    }

    protected ListMultimap<String, String> getMap (String surname, String number, String email){
        phonebook.put(surname, number);
        phonebook.put(surname, email);
        return phonebook;
    }

    public ListMultimap<String, String> getPhonebook() {
        return phonebook;
    }
}
