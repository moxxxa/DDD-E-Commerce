package model.user;


import java.sql.Date;

public class User {

    private String id;
    private String name;
    private String firstName;
    private Date birthDate;
    private String email;
    // Raison de simplicités
    private String address;

    public User(String id, String name, String firstName, Date birthDate, String email, String address) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.email = email;
        this.address = address;
    }

    public User(){

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
