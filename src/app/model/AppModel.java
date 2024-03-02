package app.model;

import app.entity.User;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AppModel {

    private final DataProvider dataProvider = new DataProvider();

    public int getLastUserIndex(){
        return dataProvider.provideData().size() - 1;
    }

    public String getAllUser(){
        List<User> userList = dataProvider.provideData();
        StringBuilder output = new StringBuilder();
        AtomicInteger counter = new AtomicInteger(0);
        for (User user : userList){
            output.append(counter.incrementAndGet());
            output.append(") ");
            output.append(user);
            if (counter.get() < userList.size()){
                output.append("\n");
            }
        }
        return output.toString();
    }

    public String getUserByIndex(int index){
        User user = dataProvider.provideData().get(index);
        return user.toString();
    }

}
