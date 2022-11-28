package Pasport;

import Multiply.MultiplicationTable;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Passport ivan = new Passport(123456, "Иван", "Иванов", "Иванович", LocalDate.of(2014, 8, 24));
        Passport sveta = new Passport(8755666, "Светлана", "Привалова", "Кондратовна", LocalDate.of(2015, 3, 5));

        PassportList passportList = new PassportList();
        passportList.addPassport(ivan);
        passportList.addPassport(sveta);

        System.out.println(passportList.findByNumber(123456));
        ;



    }


}
