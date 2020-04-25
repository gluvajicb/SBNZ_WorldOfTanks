package com.example.WoTRecommender.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tank {

    private enum TankType{
        HEAVY,
        MEDIUM,
        LIGHT,
        DESTROYER,
        SPG
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private TankType tankType;

    private Integer damage;

    private Integer penetration ;

    private Float reloadTime;

    private Float topSpeed;

    private Integer health;

    private Integer armor;

    private Integer viewRange;

    @OneToMany(mappedBy = "tank")
    private List<UserTank> users;


    public Tank(Long id, String name, TankType tankType, Integer damage, Integer penetration, Float reloadTime,
                Float topSpeed, Integer health, Integer armor, Integer viewRange, List<UserTank> users) {
        this.id = id;
        this.name = name;
        this.tankType = tankType;
        this.damage = damage;
        this.penetration = penetration;
        this.reloadTime = reloadTime;
        this.topSpeed = topSpeed;
        this.health = health;
        this.armor = armor;
        this.viewRange = viewRange;
        this.users = users;
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
        this.name = name;
    }

    public TankType getTankType() {
        return tankType;
    }

    public void setTankType(TankType tankType) {
        this.tankType = tankType;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getPenetration() {
        return penetration;
    }

    public void setPenetration(Integer penetration) {
        this.penetration = penetration;
    }

    public Float getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(Float reloadTime) {
        this.reloadTime = reloadTime;
    }

    public Float getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Float topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public Integer getViewRange() {
        return viewRange;
    }

    public void setViewRange(Integer viewRange) {
        this.viewRange = viewRange;
    }

    public List<UserTank> getUsers() {
        return users;
    }

    public void setUsers(List<UserTank> users) {
        this.users = users;
    }


}
