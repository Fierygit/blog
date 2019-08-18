package Firefly.blog.entity;

import org.springframework.context.annotation.Bean;

import java.util.Date;



public class User {
    private Long id;

    private String name;

    private String password;

    private Date regDate;

    private Boolean sex;

    public User(){

    }

    public User(Long id, String name, String password, Date regDate, Boolean sex) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.regDate = regDate;
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
}