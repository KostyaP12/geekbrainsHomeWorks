package ru.geekbrains.java_level_a.lesson_d;

public class HomeWork {
    public static void main (String[] args){
        Staff firstStaff = new Staff("Peter Jackson", 5000, 58);
        Staff secondStaff = new Staff("Martin Scorsese", 8000, 77);
        Staff thirdStaff = new Staff("Guy Ritchie", 4000, 52);
        Staff fourthStaff = new Staff("Emma Watson", 2000, 30);
        Staff fifthStaff = new Staff("Daisy Ridley", 1500, 28);
        Staff[] staffs = {firstStaff, secondStaff, thirdStaff, fourthStaff, fifthStaff};


        for(int i = 0; i < staffs.length; i++){
            if (staffs[i].getAge() > 40){
                System.out.printf("Name: %s Salary: %d Age: %d \n",
                        staffs[i].getFullName(), staffs[i].getSalary(), staffs[i].getAge());
            }
        }
    }
}
