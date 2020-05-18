package com.example.WoTRecommender.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TANK")
public class Tank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Enumerated(EnumType.STRING)
    private TankType tankType;

    @Column(name="damage")
    private Integer damage;

    @Column(name="penetration")
    private Integer penetration ;

    @Column(name="reload_time")
    private Integer reloadTime;

    @Column(name="top_speed")
    private Integer topSpeed;

    @Column(name="health", length=50, nullable=false, unique=false)
    private Integer health;

    @Column(name="armor", length=50, nullable=false, unique=false)
    private Integer armor;

    @Column(name="view_range", length=50, nullable=false, unique=false)
    private Integer viewRange;

    @OneToMany(mappedBy = "tank")
    private List<UserTank> users;

    public Tank() {
    }

    public Tank(Long id, String name, TankType tankType, Integer damage, Integer penetration, Integer reloadTime,
                Integer topSpeed, Integer health, Integer armor, Integer viewRange, List<UserTank> users) {
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

    public Integer getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(Integer reloadTime) {
        this.reloadTime = reloadTime;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Integer topSpeed) {
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
