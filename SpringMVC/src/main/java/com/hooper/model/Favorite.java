package com.hooper.model;

import javax.persistence.*;

public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "userId")
    private Integer userid;

    @Column(name = "gameId")
    private Integer gameid;

    private Long ctime;

    private Long utime;

    private Boolean deleted;

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
     * @return userId
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return gameId
     */
    public Integer getGameid() {
        return gameid;
    }

    /**
     * @param gameid
     */
    public void setGameid(Integer gameid) {
        this.gameid = gameid;
    }

    /**
     * @return ctime
     */
    public Long getCtime() {
        return ctime;
    }

    /**
     * @param ctime
     */
    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    /**
     * @return utime
     */
    public Long getUtime() {
        return utime;
    }

    /**
     * @param utime
     */
    public void setUtime(Long utime) {
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
}