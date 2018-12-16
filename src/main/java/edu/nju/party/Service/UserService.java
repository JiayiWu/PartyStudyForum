package edu.nju.party.Service;

import edu.nju.party.Entity.User;

public interface UserService {

    public boolean login(String userID, String password);

    public boolean register(User user);

    public User getInfo(String userID);
}
