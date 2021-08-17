package ru.geekbrains.homework_5;

public class Main {
    public static void main(String[] args) {
        Person[] personArray = new Person[5];

        personArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                "892312312", 100000, 30);
        personArray[1] = new Person("Ptrov Petr", "Сook", "petrov@mailbox.com",
                "892231412", 70000, 45);
        personArray[2] = new Person("Sidorov Vasiliy", "Tractor driver", "sidorov@mailbox.com",
                "890042312", 1500000, 70);
        personArray[3] = new Person("Tsar Ivan", "Tsar", "tsar@mailbox.com",
                "892300012", 80000, 30);
        personArray[4] = new Person("Ivanov Ivan", "Pilot", "ivivan@mailbox.com",
                "892312312", 90000, 25);

        for (Person array : personArray) {
            if (array.getAge() > 40) array.getAllInfo();
        }
    }
}
