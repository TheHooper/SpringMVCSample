package com.hooper.model;

import javax.persistence.*;

public class Gamecat extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "gameId")
    private Integer gameid;

    @Column(name = "catId")
    private Integer catid;

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
     * @return catId
     */
    public Integer getCatid() {
        return catid;
    }

    /**
     * @param catid
     */
    public void setCatid(Integer catid) {
        this.catid = catid;
    }
}