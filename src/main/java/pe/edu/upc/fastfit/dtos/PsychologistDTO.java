package pe.edu.upc.fastfit.dtos;
import java.time.LocalDate;

import pe.edu.upc.fastfit.entities.UserStatus;
import pe.edu.upc.fastfit.entities.Gender;
import pe.edu.upc.fastfit.entities.Specialty;


public class PsychologistDTO {

    private int idPsi;

    private String userName;

    private String password;

    private String names;

    private String lastNames;

    private String emailAddress;

    private String phoneNumber;

    private int age;

    private int rating;
    private UserStatus userStatus;

    private Gender Gender;

    private Specialty specialty;


    public int getIdPsi() {
        return idPsi;
    }

    public void setIdPsi(int idPsi) {
        this.idPsi = idPsi;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public pe.edu.upc.fastfit.entities.Gender getGender() {
        return Gender;
    }

    public void setGender(pe.edu.upc.fastfit.entities.Gender gender) {
        Gender = gender;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}
