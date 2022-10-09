package Homework_3.entities.concretes;

import java.time.LocalDate;

public class IndividualUser extends User{
    private String firstName;
    private String lastName;
    private LocalDate birthOfDate;
    private String nationalityId;

    public IndividualUser(int id, String email, String firstName, String lastName, LocalDate birthOfDate, String nationalityId) {
        super(id, email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;
        this.nationalityId = nationalityId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(LocalDate birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
