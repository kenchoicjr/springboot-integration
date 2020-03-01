package com.hehe.integration.user;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customerservice_user")
public class User implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "nick_name")
    private String nick_name;
    @Column(name = "password")
    private String password;
    @Column(name = "headimgurl")
    private String headimgurl;
    @Column(name = "loginstate")
    private Integer loginstate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public Integer getLoginstate() {
        return loginstate;
    }

    public void setLoginstate(Integer loginstate) {
        this.loginstate = loginstate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", nick_name='" + nick_name + '\'' +
                ", password='" + password + '\'' +
                ", headimgurl='" + headimgurl + '\'' +
                ", loginstate=" + loginstate +
                '}';
    }
}
