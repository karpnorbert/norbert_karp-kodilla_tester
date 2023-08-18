package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public static double avgNumberOfPostsForUsersAbove40(List<User> users) {
        return users.stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .orElse(0.0);
    }

    public static double avgNumberOfPostsForUsersBelow40(List<User> users) {
        return users.stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        System.out.println("Średnia liczba postów dla użytkowników >= 40 lat: " + avgNumberOfPostsForUsersAbove40(UsersRepository.getUsersList()));
        System.out.println("Średnia liczba postów dla użytkowników < 40 lat: " + avgNumberOfPostsForUsersBelow40(UsersRepository.getUsersList()));
    }
}
