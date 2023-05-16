package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class StatisticCalculate {

    int numberOfUsers;
    int numberOfPosts;
    int numbersOfComments;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumbersOfComments() {
        return numbersOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatisticCalculate that = (StatisticCalculate) o;
        return numberOfUsers == that.numberOfUsers && numberOfPosts == that.numberOfPosts
                && numbersOfComments == that.numbersOfComments
                && Double.compare(that.averagePostsPerUser, averagePostsPerUser) == 0
                && Double.compare(that.averageCommentsPerUser, averageCommentsPerUser) == 0
                && Double.compare(that.averageCommentsPerPost, averageCommentsPerPost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfUsers, numberOfPosts, numbersOfComments,
                averagePostsPerUser, averageCommentsPerUser, averageCommentsPerPost);
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numbersOfComments = statistics.commentsCount();

        if (numberOfUsers != 0) {
            averagePostsPerUser = numberOfPosts / (double)numberOfUsers;
            averageCommentsPerUser = numbersOfComments / (double) numberOfUsers;
        }
        if (numberOfPosts != 0) {
            averageCommentsPerPost = numbersOfComments / (double) numberOfPosts;
        }
    }

    public void showStatistics(Statistics statistics) {
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numbersOfComments);
        System.out.println("Average number of posts per user: " + averagePostsPerUser);
        System.out.println("Average number of comments per user: " + averageCommentsPerUser);
        System.out.println("Average number of comments per post: " + averageCommentsPerPost);
    }

}
