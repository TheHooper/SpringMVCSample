package com.hooper.model;

public class Admin {
    private Integer id;

    private String name;

    private String password;

    private String randomsalt;

    private String avatar;

    private Long ctime;

    private Long utime;

    private Boolean deleted;

    private Long lastlogintime;

    private Long lastloginip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getRandomsalt() {
        return randomsalt;
    }

    public void setRandomsalt(String randomsalt) {
        this.randomsalt = randomsalt == null ? null : randomsalt.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public Long getUtime() {
        return utime;
    }

    public void setUtime(Long utime) {
        this.utime = utime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Long lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Long getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(Long lastloginip) {
        this.lastloginip = lastloginip;
    }
}