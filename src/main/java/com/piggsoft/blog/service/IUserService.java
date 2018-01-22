package com.piggsoft.blog.service;


import com.piggsoft.blog.po.User;

public interface IUserService {
    void save(User user);

    User findByUsername(String username);
}
