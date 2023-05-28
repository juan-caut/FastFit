package pe.edu.upc.fastfit.entities;
import javax.persistence.*;

@Entity
@Table(name="Psychologists")
public class Psychologist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPsi;
    @Column(name = "UserName", length = 25, nullable = false)
    private String UserName;
    @Column(name = "Password", length = 20, nullable = false)
    private String Password;
    @Column(name = "Names", length = 30, nullable = false)
    private String Names;
    @Column(name = "LastNames", length = 30, nullable = false)
    private String LastNames;
    @Column(name = "EmailAddress", length = 25, nullable = false)
    private String EmailAddress;
    @Column(name = "PhoneNumber", length = 9, nullable = false)
    private String PhoneNumber;
    @Column(name = "Age", length = 3, nullable = false)
    private int Age;
    @Column(name = "rating", length = 4, nullable = false)
    private int rating;
    @Column(name = "UserStatus_Id", length = 4, nullable = false)
    private int UserStatus_Id;
    @Column(name = "Speciality_Id", length = 4, nullable = false)
    private int Speciality_Id;
    @Column(name = "Gender_Id", length = 4, nullable = false)
    private String Gender_Id;

    public Psychologist(int idPsi, String userName, String password, String names, String lastNames, String emailAddress, String phoneNumber, int age, int rating, int userStatus_Id, int speciality_Id, String gender_Id) {
        this.idPsi = idPsi;
        this.UserName = userName;
        this.Password = password;
        this.Names = names;
        this.LastNames = lastNames;
        this.EmailAddress = emailAddress;
        this.PhoneNumber = phoneNumber;
        this.Age = age;
        this.rating = rating;
        this.UserStatus_Id = userStatus_Id;
        this.Speciality_Id = speciality_Id;
        this.Gender_Id = gender_Id;
    }

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

    public Psychologist(){

    }
}


