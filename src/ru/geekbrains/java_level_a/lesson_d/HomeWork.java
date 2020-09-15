package ru.geekbrains.java_level_a.lesson_d;

public class HomeWork {
    public static void main (String[] args){
        Staff firstStaff = new Staff("Peter Jackson", 5000, 58);
        Staff secondStaff = new Staff("Martin Scorsese", 8000, 77);
        Staff thirdStaff = new Staff("Guy Ritchie", 4000, 52);
        Staff fourthStaff = new Staff("Emma Watson", 2000, 30);
        Staff fifthStaff = new Staff("Daisy Ridley", 1500, 28);
        Staff[] staffs = {firstStaff, secondStaff, thirdStaff, fourthStaff, fifthStaff};
        showStaff(staffs);
        riseSalary(staffs);
        showStaff(staffs);
        int averageAge = averageAge(staffs);
        int averageSalary = averageSalary(staffs);
        System.out.printf("Средний возраст : %d \nСредняя зарплата : %d", averageAge, averageSalary);
    }

    private static void showStaff(Staff[] staffs) {
        for(int i = 0; i < staffs.length; i++){
            if (staffs[i].getAge() > 40){
                System.out.printf("Name: %s Salary: %d Age: %d \n",
                        staffs[i].getFullName(), staffs[i].getSalary(), staffs[i].getAge());
            }
        }
    }
    public static void riseSalary(Staff[] staffs){
        for(int i = 0; i < staffs.length; i++){
            if(staffs[i].getAge() > 50){
                staffs[i].setSalary(5000);
            }
        }
    }
    public static int averageAge(Staff[] staffs){
        int sum = 0;
        int sumStaffs = 0;
        for (int i = 0; i < staffs.length; i++){
            sum += staffs[i].getAge();
            sumStaffs++;
        }
        return sum/sumStaffs;
    }
    public static int averageSalary(Staff[] staffs){
        int sum = 0;
        int sumStaffs = 0;
        for (int i = 0; i < staffs.length; i++){
            sum += staffs[i].getSalary();
            sumStaffs++;
        }
        return sum/sumStaffs;
    }
}
