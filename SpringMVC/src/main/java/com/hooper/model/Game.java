package com.hooper.model;

public class Game {
    private Integer id;

    private String title;

    private String imgsrc;

    private String donwloadurl;

    private String intro;

    private Integer viewcount;

    private Integer favourcount;

    private Integer donwloadcount;

    private Long ctime;

    private Long utime;

    private Boolean deleted;

    private String detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc == null ? null : imgsrc.trim();
    }

    public String getDonwloadurl() {
        return donwloadurl;
    }

    public void setDonwloadurl(String donwloadurl) {
        this.donwloadurl = donwloadurl == null ? null : donwloadurl.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public Integer getFavourcount() {
        return favourcount;
    }

    public void setFavourcount(Integer favourcount) {
        this.favourcount = favourcount;
    }

    public Integer getDonwloadcount() {
        return donwloadcount;
    }

    public void setDonwloadcount(Integer donwloadcount) {
        this.donwloadcount = donwloadcount;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}