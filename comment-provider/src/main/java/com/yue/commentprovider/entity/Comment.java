package com.yue.commentprovider.entity;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {

    private int comm_id;
    private String comm_cont;
    private Date comm_time;

    @Override
    public String toString() {
        return "Comment{" +
                "comm_id=" + comm_id +
                ", comm_cont='" + comm_cont + '\'' +
                ", comm_time=" + comm_time +
                '}';
    }

    public Comment(){

    }

    public Comment(int comm_id, String comm_cont, Date comm_time, int watched_times) {
        this.comm_id = comm_id;
        this.comm_cont = comm_cont;
        this.comm_time = comm_time;
    }

    public int getComm_id() {
        return comm_id;
    }

    public void setComm_id(int comm_id) {
        this.comm_id = comm_id;
    }

    public String getComm_cont() {
        return comm_cont;
    }

    public void setComm_cont(String comm_cont) {
        this.comm_cont = comm_cont;
    }

    public Date getComm_time() {
        return comm_time;
    }

    public void setComm_time(Date comm_time) {
        this.comm_time = comm_time;
    }

}
