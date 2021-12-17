package se.Lexicon;

public class User {
    private int ID;
    private String email;
    private String Name;
    private String Phone;
    private String City;

    public User(int ID, String email, String name, String phone, String city) {
        this.ID = ID;
        this.email = email;
        this.Name = name;
        this.Phone = phone;
        this.City = city;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
