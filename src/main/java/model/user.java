package model;

public class User {

    //id INT PRIMARY KEY AUTO_INCREMENT,
   // first_name VARCHAR(100) NOT NULL,
   // last_name VARCHAR(100) NOT NULL,
   // email VARCHAR(100) NOT NULL


    public   int id;
    public String firstName;
    public String lastName;
    public String emaill;

    public User(int id, String  firstNameame, String lastNameame, String emaill){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.emaill=emaill;
    }

    public User(String firstName, String lastName, String emaill) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emaill = emaill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }
}
