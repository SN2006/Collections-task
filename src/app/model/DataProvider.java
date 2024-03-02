package app.model;

import app.entity.User;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public List<User> provideData(){
        List<User> userList = new ArrayList<>();
        userList.add(new User("Tom", "tom123@gmail.com"));
        userList.add(new User("Andrey", "andrey_pro@outlook.com"));
        userList.add(new User("Sasha", "alek@gmail.com"));
        userList.add(new User("Alina", "lina_alina@gmail.com"));
        userList.add(new User("Peter", "peter123@outlook.com"));
        return userList;
    }

}
