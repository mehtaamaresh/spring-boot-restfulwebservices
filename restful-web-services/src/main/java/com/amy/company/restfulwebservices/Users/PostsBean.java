package com.amy.company.restfulwebservices.Users;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class PostsBean {

    @Id
    @GeneratedValue
    private Integer id;
    private String post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore //Must to avoid recursive user - posts and vice-versa
    private UserBean user;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "PostsBean{" +
                "id=" + id +
                ", post='" + post + '\'' +
                ", user=" + user +
                '}';
    }
}
