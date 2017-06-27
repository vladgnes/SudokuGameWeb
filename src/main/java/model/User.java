package model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    public User(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}
}
