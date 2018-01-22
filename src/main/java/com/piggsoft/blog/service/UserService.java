package com.piggsoft.blog.service;


import com.piggsoft.blog.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
