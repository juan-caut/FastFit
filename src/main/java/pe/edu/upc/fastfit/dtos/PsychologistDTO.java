package pe.edu.upc.fastfit.dtos;

import java.time.LocalDate;
public class PsychologistDTO {

    private int idPsi;
    private String UserName;
    private String Password;
    private String Names;
    private String LastNames;
    private String EmailAddress;
    private String PhoneNumber;
    private int Age;
    private int rating;
    private int UserStatus_Id;
    private int Speciality_Id;
    private String Gender_Id;

    public int getIdPsi() {
        return idPsi;
    }

    public void setIdPsi(int idPsi) {
        this.idPsi = idPsi;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }

    public String getLastNames() {
        return LastNames;
    }

    public void setLastNames(String lastNames) {
        LastNames = lastNames;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
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

    public int getSpeciality_Id() {
        return Speciality_Id;
    }

    public void setSpeciality_Id(int speciality_Id) {
        Speciality_Id = speciality_Id;
    }

    public String getGender_Id() {
        return Gender_Id;
    }

    public void setGender_Id(String gender_Id) {
        Gender_Id = gender_Id;
    }
}
