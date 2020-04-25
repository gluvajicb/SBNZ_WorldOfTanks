package com.example.WoTRecommender.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private Integer balance;

    private Boolean discount;

    @OneToMany(mappedBy = "user")
    private List<UserTank> tanks;


    public User(Long id, String username, String password, Integer balance, Boolean discount, List<UserTank> tanks) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.discount = discount;
        this.tanks = tanks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Boolean getDiscount() {
        return discount;
    }

    public void setDiscount(Boolean discount) {
        this.discount = discount;
    }

    public List<UserTank> getTanks() {
        return tanks;
    }

    public void setTanks(List<UserTank> tanks) {
        this.tanks = tanks;
    }
}
