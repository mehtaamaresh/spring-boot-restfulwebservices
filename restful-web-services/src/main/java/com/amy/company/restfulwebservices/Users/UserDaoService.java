package com.amy.company.restfulwebservices.Users;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component //or if JPA Repository
public class UserDaoService {
    private static List<UserBean> users = new ArrayList<>();
    private static int usersCount = 3;

    static {
        users.add(new UserBean(1, "Alfa", new Date()));
        users.add(new UserBean(2, "Beta", new Date()));
        users.add(new UserBean(3, "Gama", new Date()));
    }

    public List<UserBean> findAll(){
        return users;
    }

    public UserBean save(UserBean user){
        if(user.getId() == null){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public UserBean findOne(int id){
        for (UserBean user: users) {
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public UserBean deleteById(int id){
        Iterator<UserBean> iterator = users.iterator();
        while(iterator.hasNext()){
            UserBean user = iterator.next();
            if (user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}
