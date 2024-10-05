package org.example.Service;

import org.example.Modal.Users;
import org.example.Reponsitory.UserReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    private UserReponsitory userReponsitory;
    public ArrayList<Users> getAllUSer () {
        return (ArrayList<Users>) userReponsitory.findAll();
    }
}
