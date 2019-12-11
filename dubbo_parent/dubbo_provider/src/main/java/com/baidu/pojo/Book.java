package com.baidu.pojo;

import java.io.Serializable;

/**
 * Created by xxf123 on 2019/10/9.
 */
public class Book implements Serializable{
    private Integer bid;
    private Integer blook;
    private String bname;
    private String btype;
    private Integer comnum;

    public Book(Integer bid, Integer blook, String bname, String btype, Integer comnum) {
        this.bid = bid;
        this.blook = blook;
        this.bname = bname;
        this.btype = btype;
        this.comnum = comnum;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", blook=" + blook +
                ", bname='" + bname + '\'' +
                ", btype='" + btype + '\'' +
                ", comnum=" + comnum +
                '}';
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getBlook() {
        return blook;
    }

    public void setBlook(Integer blook) {
        this.blook = blook;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype;
    }

    public Integer getComnum() {
        return comnum;
    }

    public void setComnum(Integer comnum) {
        this.comnum = comnum;
    }
}
