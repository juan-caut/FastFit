package pe.edu.upc.fastfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "Psychologists")
public class Psychologist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPsi;
    @Column(name = "userName", length = 25, nullable = false)
    private String userName;
    @Column(name = "password", length = 20, nullable = false)
    private String password;
    @Column(name = "names", length = 30, nullable = false)
    private String names;
    @Column(name = "lastNames", length = 30, nullable = false)
    private String lastNames;
    @Column(name = "emailAddress", length = 25, nullable = false)
    private String emailAddress;
    @Column(name = "phoneNumber", length = 9, nullable = false)
    private String phoneNumber;
    @Column(name = "age", nullable = false)
    private int age;
    @Column(name = "rating", nullable = false)
    private int rating;
    @ManyToOne
    @JoinColumn(name = "idUS")
    private UserStatus userStatus;
    @ManyToOne
    @JoinColumn(name = "idgender")
    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "idSpecialty")
    private Specialty specialty;

    public Psychologist() {

    }

    public Psychologist(int idPsi, String userName, String password, String names, String lastNames, String emailAddress, String phoneNumber, int age, int rating, UserStatus userStatus, Gender gender, Specialty specialty) {
        this.idPsi = idPsi;
        this.userName = userName;
        this.password = password;
        this.names = names;
        this.lastNames = lastNames;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.rating = rating;
        this.userStatus = userStatus;
        this.gender = gender;
        this.specialty = specialty;
    }

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}


