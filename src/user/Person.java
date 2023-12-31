package user;

public class Person {
    private Long id;
    private String fullName;
    private String email;
    private String password;

    public Person(Long id, String fullName, String email, String password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "\n Person " +
                "\nid: " + id +
                ",\n fullName: '" + fullName + '\'' +
                ",\n email: '" + email + '\'' +
                ",\n password: '" + password + '\'';
    }
}
