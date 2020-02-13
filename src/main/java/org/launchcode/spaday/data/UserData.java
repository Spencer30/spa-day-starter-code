package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {
    // need a place to user data
    private static final Map<Integer, User> users = new HashMap<>();

    // get all events
    public static Collection<User> getAll(){
        return users.values();
    }

    // add an event
    public static void add(User user){
        users.put(user.getUserId(), user);
    }
}
