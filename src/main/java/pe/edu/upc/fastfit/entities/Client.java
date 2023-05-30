package pe.edu.upc.fastfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
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
    private int Gender_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getGender_id() {
        return Gender_id;
    }

    public void setGender_id(int gender_id) {
        Gender_id = gender_id;
    }
}
