package edu.eci.ieti.Users.data;

import edu.eci.ieti.Users.dto.RoleEnum;
import edu.eci.ieti.Users.dto.UserDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Document
public class User {


    @Indexed(unique = true)
    private String email;

    @Id
    private String id;
    private String createdAt;
    private String name;
    private String lastName;
    private String passwordHash;
    private List<RoleEnum> roles;

    public User(){
    }

    public User(String id, UserDto user, String createdAt ) {
        this.id = id;
        this.createdAt = createdAt;
        this.name = user.getName();
        this.email = user.getEmail();
        this.lastName = user.getLastName();
        this.passwordHash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        this.roles = new ArrayList<>(Collections.singleton( RoleEnum.USER ));

    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public List<RoleEnum> getRoles() {
        return roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", roles=" + roles +
                '}';
    }
}