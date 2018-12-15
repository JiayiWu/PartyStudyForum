package edu.nju.party.Impl;

import edu.nju.party.Entity.User;
import edu.nju.party.Service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserImpl implements UserService{


    @Override
    public boolean login(String userID, String password) {
        return false;
    }

    @Override
    public User getInfo(String userID) {
        return null;
    }
}
