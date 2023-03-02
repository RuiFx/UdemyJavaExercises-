package enteties;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL dd 'of' yy");
    private String name;
    private String email;
    private Date birthdate;

    public Client() {
    }

    public Client(String name, String email, Date birthddate) {
        this.name = name;
        this.email = email;
        this.birthdate = birthddate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\ne-mail: " + email +
                "\nBirthdate: " + simpleDateFormat.format(birthdate) +
                "\n-----------//-----------\n";
    }
}
