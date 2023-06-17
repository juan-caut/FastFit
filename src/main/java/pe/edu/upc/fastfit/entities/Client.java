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
    private int age;
    private int UserStatus_id;
    @ManyToOne
    @JoinColumn(name = "idgender")
    private Gender gender;


    public int getId() {
        return idClient;
    }

    public void setId(int id) {
        this.idClient = id;
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

    public int getUserStatus_id() {
        return UserStatus_id;
    }

    public void setUserStatus_id(int userStatus_id) {
        UserStatus_id = userStatus_id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
