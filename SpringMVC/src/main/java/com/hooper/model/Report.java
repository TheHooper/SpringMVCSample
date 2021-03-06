package com.hooper.model;

import javax.persistence.*;

public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String intro;

    /**
     * 1新闻、2公告
     */
    private Boolean type;

    private Long ctime;

    private Long utime;

    private Boolean deleted;

    private String context;

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
     * @return intro
     */
    public String getIntro() {
        return intro;
    }

    /**
     * @param intro
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     * 获取1新闻、2公告
     *
     * @return type - 1新闻、2公告
     */
    public Boolean getType() {
        return type;
    }

    /**
     * 设置1新闻、2公告
     *
     * @param type 1新闻、2公告
     */
    public void setType(Boolean type) {
        this.type = type;
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

    /**
     * @return context
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context
     */
    public void setContext(String context) {
        this.context = context;
    }
}