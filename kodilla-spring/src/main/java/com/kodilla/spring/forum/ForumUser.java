package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String userName;

    ForumUser() {
        userName = "John Smith";

    }
}
