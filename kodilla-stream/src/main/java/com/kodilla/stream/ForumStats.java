package com.kodilla.stream;

import java.util.List;

public class ForumStats {
    public static double calculateAveragePostsForUsersAboveAge(List<User> users, int age) {
        return users.stream()
                .filter(user -> user.getAge() >= age)
                .mapToInt(user->user.getNumberOfPosts())
                .average()
                .orElse(0.0);
    }

    public static double calculateAveragePostsForUsersBelowAge(List<User> users, int age) {
        return users.stream()
                .filter(user -> user.getAge() < age)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        double averagePostsAbove40 = calculateAveragePostsForUsersAboveAge(users, 40);
        double averagePostsBelow40 = calculateAveragePostsForUsersBelowAge(users, 40);

        System.out.println("Average posts for users above 40: " + averagePostsAbove40);
        System.out.println("Average posts for users below 40: " + averagePostsBelow40);
    }
}
