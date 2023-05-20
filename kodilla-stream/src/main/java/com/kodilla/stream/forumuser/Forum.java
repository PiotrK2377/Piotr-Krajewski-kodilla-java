package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "Wolf", 'M', 2000, 11, 2, 0));
        theForumUserList.add(new ForumUser(2, "Sandra", 'F', 1998, 3, 12, 5));
        theForumUserList.add(new ForumUser(3, "Mike", 'M', 2007, 7, 23, 1));
        theForumUserList.add(new ForumUser(4, "Sue", 'F', 2005, 9, 30, 20));
        theForumUserList.add(new ForumUser(5, "John", 'M', 1990, 2, 20, 15));
        theForumUserList.add(new ForumUser(6, "Eli", 'F', 2001, 4, 15, 7));
        theForumUserList.add(new ForumUser(7, "Steve", 'M', 2002, 4, 11, 30));
        theForumUserList.add(new ForumUser(8, "Bob", 'M', 2003, 5, 20, 51));


    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
