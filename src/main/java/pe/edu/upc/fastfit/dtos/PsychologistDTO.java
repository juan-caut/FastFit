package pe.edu.upc.fastfit.dtos;

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

    private int UserStatus_Id;

    private String Gender_Id;

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

    public int getUserStatus_Id() {
        return UserStatus_Id;
    }

    public void setUserStatus_Id(int userStatus_Id) {
        UserStatus_Id = userStatus_Id;
    }

    public String getGender_Id() {
        return Gender_Id;
    }

    public void setGender_Id(String gender_Id) {
        Gender_Id = gender_Id;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}
