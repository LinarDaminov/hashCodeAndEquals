package Pasport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final int numberOfID;
    private final String firstName;
     private final String lastName;
    private final String patronymic;
    private final LocalDate localDate;

    public Passport(int numberOfID, String firstName, String lastName, String patronymic, LocalDate localDate) {
        this.numberOfID = numberOfID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.localDate = localDate;
    }

    public int getNumberOfID() {
        return numberOfID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "numberOfID=" + numberOfID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", localDate=" + localDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return numberOfID == passport.numberOfID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfID);
    }
}

