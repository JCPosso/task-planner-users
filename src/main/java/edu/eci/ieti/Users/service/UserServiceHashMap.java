package edu.eci.ieti.Users.service;


import edu.eci.ieti.Users.data.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserServiceHashMap  {

    private HashMap<String, User>  userHash = new HashMap<>();

    public User create(User user) {
        return userHash.put(user.getId(), user);
    }

    public User findById(String id) {
        return userHash.get(id);
    }

    public List<User> getAll() {
        return new ArrayList<User>(userHash.values());
    }

    public void deleteById(String id) {
        userHash.remove(id);
    }

    public User update(User user, String userId) {
        userHash.replace(userId,user);
        return userHash.get(userId);
    }
}
