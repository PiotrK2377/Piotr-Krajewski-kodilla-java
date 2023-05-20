package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum theForum = new Forum();


        Map<Integer, ForumUser> theResultMapOfForumUser = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() != 'F')
                .filter(forumUser -> forumUser.getNumberPublicationPost() > 0)
                .filter(forumUser -> forumUser.getBirthDate().getYear() <= 2003 && forumUser.getBirthDate().getDayOfMonth() <= 20 && forumUser.getBirthDate().getMonthValue() <= 5 )
                .collect(Collectors.toMap(ForumUser::getIdNumberUser, forumUser -> forumUser));


        System.out.println("# elements: " + theResultMapOfForumUser.size());
        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey()+ ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
