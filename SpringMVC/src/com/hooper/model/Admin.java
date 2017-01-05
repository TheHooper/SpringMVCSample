package com.hooper.model;

import java.util.Date;
import javax.persistence.*;

public class Admin extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String password;

    @Column(name = "randomSalt")
    private String randomsalt;

    private String avatar;

    private Date ctime;

    private Date utime;

    private Boolean deleted;

    @Column(name = "lastLoginTime")
    private Long lastlogintime;

    @Column(name = "lastLoginIp")
    private Long lastloginip;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return randomSalt
     */
    public String getRandomsalt() {
        return randomsalt;
    }

    /**
     * @param randomsalt
     */
    public void setRandomsalt(String randomsalt) {
        this.randomsalt = randomsalt;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * @return ctime
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * @param ctime
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * @return utime
     */
    public Date getUtime() {
        return utime;
    }

    /**
     * @param utime
     */
    public void setUtime(Date utime) {
        this.utime = utime;
    }

    /**
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * @return lastLoginTime
     */
    public Long getLastlogintime() {
        return lastlogintime;
    }

    /**
     * @param lastlogintime
     */
    public void setLastlogintime(Long lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * @return lastLoginIp
     */
    public Long getLastloginip() {
        return lastloginip;
    }

    /**
     * @param lastloginip
     */
    public void setLastloginip(Long lastloginip) {
        this.lastloginip = lastloginip;
    }
}