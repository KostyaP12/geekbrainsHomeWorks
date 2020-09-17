package ru.geekbrains.java_level_a.lesson_d;

public class HomeWork {
    public static void main (String[] args){
        Staff firstStaff = new Staff("Peter Jackson", 5000, 58);
        Staff secondStaff = new Staff("Martin Scorsese", 8000, 77);
        Staff thirdStaff = new Staff("Guy Ritchie", 4000, 52);
        Staff fourthStaff = new Staff("Emma Watson", 2000, 30);
        Staff fifthStaff = new Staff("Daisy Ridley", 1500, 28);
        Staff[] staffs = {firstStaff, secondStaff, thirdStaff, fourthStaff, fifthStaff};                    // 5 задание

        showAllStaffs(staffs);                                                                              // 4 задание

        riseSalary(staffs);                                                                                 // 6 задание

        showStaff(staffs);                                                                                  // 5 задание

        int averageAge = averageAge(staffs);                                                                // 7 задание
        int averageSalary = averageSalary(staffs);                                                          // 7 задание
        System.out.printf("Средний возраст : %d \nСредняя зарплата : %d", averageAge, averageSalary);       // 7 задание
    }

    private static void showAllStaffs(Staff[] staffs) {
        for(int i = 0; i < staffs.length; i++){
                System.out.printf("Name: %s %d Age: \n",
                        staffs[i].getFullName(), staffs[i].getAge());
        }
    }                                                 // 4 задание
    private static void showStaff(Staff[] staffs) {
        for(int i = 0; i < staffs.length; i++){
            if (staffs[i].getAge() > 40){
                System.out.printf("Name: %s Salary: %d Age: %d Id: %d\n",
                        staffs[i].getFullName(), staffs[i].getSalary(), staffs[i].getAge(), staffs[i].getId());
            }
        }
    }                                                     // 5 задание
    public static void riseSalary(Staff[] staffs){
        for(int i = 0; i < staffs.length; i++){
            if(staffs[i].getAge() > 50){
                staffs[i].setSalary(5000);
            }
        }
    }                                                      // 6 задание
    public static int averageAge(Staff[] staffs){
        int sum = 0;
        int sumStaffs = 0;
        for (int i = 0; i < staffs.length; i++){
            sum += staffs[i].getAge();
            sumStaffs++;
        }
        return sum/sumStaffs;
    }                                                       // 7 задание
    public static int averageSalary(Staff[] staffs){
        int sum = 0;
        int sumStaffs = 0;
        for (int i = 0; i < staffs.length; i++){
            sum += staffs[i].getSalary();
            sumStaffs++;
        }
        return sum/sumStaffs;
    }                                                    // 7 задание
}
