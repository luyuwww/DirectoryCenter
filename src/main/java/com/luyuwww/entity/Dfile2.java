package com.luyuwww.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by serv on 2014/11/6.
 */
@Entity
@Table(name = "D_FILE2")
public class Dfile2 extends AmsBaseEntity {

    @Column(name="TITLE")
    private String title;
    @Column(name="KEYWORD")
    private String keyword;
    @Column(name="XMMC")
    private String xmmc;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }
}
