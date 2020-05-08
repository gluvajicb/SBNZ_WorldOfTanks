package com.example.WoTRecommender.model;

import javax.persistence.*;

@Entity
public class UserTank {

    @EmbeddedId
    UserTankKey id;

    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("tank_id")
    @JoinColumn(name = "tank_id")
    private Tank tank;

    public UserTank(UserTankKey id, User user, Tank tank) {
        this.id = id;
        this.user = user;
        this.tank = tank;
    }

    public UserTankKey getId() {
        return id;
    }

    public void setId(UserTankKey id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }
}
