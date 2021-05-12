package br.com.projeto.ecantina.dto.Request;

import br.com.projeto.ecantina.models.Client;
import br.com.projeto.ecantina.models.User;

public class RequestUserDto {
    
    private String email;
    private String password;
    private String name;
    private String type;

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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public User convert() {
        return new Client(getEmail(), getPassword(), getName());
    }
}