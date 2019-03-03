package com.amy.company.restfulwebservices.Users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
//@ApiModel(description=" ") // for swagger
//@JsonIgnore(value={"", ""}) //Static Filtering
//@JsonFilter("UserBean") //Dynamic Filtering
public class UserBean {

    @Id
    @GeneratedValue
    //@ApiModelProperty(notes=" ") //swagger
    private Integer id;

    @Size(min=2, message="Name should have at least 2 char") // Validation
    private String name;

    //@Past// validation
    //@JsonIgnore //Static Filtering
    private Date birthDate;

    @OneToMany(mappedBy = "user")
    private List<PostsBean> posts;

    public UserBean(){}

    public UserBean(Integer id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public List<PostsBean> getPosts() {
        return posts;
    }

    public void setPosts(List<PostsBean> posts) {
        this.posts = posts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
