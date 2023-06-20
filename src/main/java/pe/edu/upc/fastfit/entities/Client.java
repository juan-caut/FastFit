package pe.edu.upc.fastfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;
    @Column(name = "userName", length = 255, nullable = false)
    private String userName;

    @Column(name = "password", length = 255, nullable = false)
    private  String password;
    @Column(name = "names", length = 255, nullable = false)
    private String names;
    @Column(name = "lastNames", length = 255, nullable = false)
    private String lastNames;
    @Column(name = "emailAddress", length = 255, nullable = false)
    private String emailAddress;
    @Column(name = "phoneNumber", length = 50, nullable = false)
    private String phoneNumber;
    @Column(name = "age", nullable = false)
    private int age;
    @ManyToOne
    @JoinColumn(name = "idUS")
    private UserStatus userStatus;
    @ManyToOne
    @JoinColumn(name = "idgender", nullable = false)
    private Gender gender;

    public Client() {
    }

    public Client(int idClient, String userName, String password, String names, String lastNames, String emailAddress, String phoneNumber, int age, UserStatus userStatus, Gender gender) {
        this.idClient = idClient;
        this.userName = userName;
        this.password = password;
        this.names = names;
        this.lastNames = lastNames;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.userStatus = userStatus;
        this.gender = gender;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
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
}
