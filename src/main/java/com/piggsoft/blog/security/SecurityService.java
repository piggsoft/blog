package com.piggsoft.blog.security;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
