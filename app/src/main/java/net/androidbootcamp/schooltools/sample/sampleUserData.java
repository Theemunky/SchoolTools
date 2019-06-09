package net.androidbootcamp.schooltools.sample;

import net.androidbootcamp.schooltools.model.Users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sampleUserData {
    public static List<Users> userList;
    public static Map<String, Users> usersMap;

    static  {
        userList = new ArrayList<>();
        usersMap = new HashMap<>();

        addUser(new Users("cbmullins", "Chris", "Mullins", "madness", "cbmullins@gmail.com"));
    }

    private static void addUser(Users users) {
        userList.add(users);
        usersMap.put(users.getUsername(), users);
    }
}
