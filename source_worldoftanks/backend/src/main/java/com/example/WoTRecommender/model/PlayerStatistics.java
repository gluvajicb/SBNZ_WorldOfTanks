package com.example.WoTRecommender.model;

import javax.persistence.*;

@Entity
public class PlayerStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer avgDamage;

    private Integer winRate;

    private boolean gunMark; //means that player is better than 65% players in current tank

    @OneToOne
    private UserTank userTank;

    public PlayerStatistics(Long id, Integer avgDamage, Integer winRate, boolean gunMark, UserTank userTank) {
        this.id = id;
        this.avgDamage = avgDamage;
        this.winRate = winRate;
        this.gunMark = gunMark;
        this.userTank = userTank;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAvgDamage() {
        return avgDamage;
    }

    public void setAvgDamage(Integer avgDamage) {
        this.avgDamage = avgDamage;
    }

    public Integer getWinRate() {
        return winRate;
    }

    public void setWinRate(Integer winRate) {
        this.winRate = winRate;
    }

    public boolean isGunMark() {
        return gunMark;
    }

    public void setGunMark(boolean gunMark) {
        this.gunMark = gunMark;
    }

    public UserTank getUserTank() {
        return userTank;
    }

    public void setUserTank(UserTank userTank) {
        this.userTank = userTank;
    }
}
