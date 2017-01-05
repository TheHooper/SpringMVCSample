package com.hooper.model;

import java.util.Date;
import javax.persistence.*;

public class Game extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @Column(name = "imgSrc")
    private String imgsrc;

    @Column(name = "donwloadUrl")
    private String donwloadurl;

    /**
     * 简介
     */
    private String intro;

    @Column(name = "viewCount")
    private Integer viewcount;

    @Column(name = "favourCount")
    private Integer favourcount;

    @Column(name = "donwloadCount")
    private Integer donwloadcount;

    private Date ctime;

    private Date utime;

    private Boolean deleted;

    private String detail;

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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return imgSrc
     */
    public String getImgsrc() {
        return imgsrc;
    }

    /**
     * @param imgsrc
     */
    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    /**
     * @return donwloadUrl
     */
    public String getDonwloadurl() {
        return donwloadurl;
    }

    /**
     * @param donwloadurl
     */
    public void setDonwloadurl(String donwloadurl) {
        this.donwloadurl = donwloadurl;
    }

    /**
     * 获取简介
     *
     * @return intro - 简介
     */
    public String getIntro() {
        return intro;
    }

    /**
     * 设置简介
     *
     * @param intro 简介
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     * @return viewCount
     */
    public Integer getViewcount() {
        return viewcount;
    }

    /**
     * @param viewcount
     */
    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    /**
     * @return favourCount
     */
    public Integer getFavourcount() {
        return favourcount;
    }

    /**
     * @param favourcount
     */
    public void setFavourcount(Integer favourcount) {
        this.favourcount = favourcount;
    }

    /**
     * @return donwloadCount
     */
    public Integer getDonwloadcount() {
        return donwloadcount;
    }

    /**
     * @param donwloadcount
     */
    public void setDonwloadcount(Integer donwloadcount) {
        this.donwloadcount = donwloadcount;
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
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
}