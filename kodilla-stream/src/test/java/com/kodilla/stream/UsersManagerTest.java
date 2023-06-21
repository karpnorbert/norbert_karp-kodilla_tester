package com.kodilla.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames() {
        // Given
        List<String> expectedUsernames = Arrays.asList("Walter White", "Gale Boetticher");

        // When
        List<String> chemistGroupUsernames = UsersManager.filterChemistGroupUsernames();

        // Then
        Assertions.assertEquals(expectedUsernames, chemistGroupUsernames);
    }

    @Test
    public void testFilterUsersByAge() {
        // Given
        List<User> users = UsersRepository.getUsersList();
        int ageThreshold = 40;
        List<User> expectedUsers = Arrays.asList(
                new User("Walter White", 50),
                new User("Gus Firing", 49),
                new User("Gale Boetticher", 44),
                new User("Mike Ehrmantraut", 57)
        );

        // When
        List<User> filteredUsers = UsersManager.filterUsersByAge(users, ageThreshold);

        // Then
        Assertions.assertEquals(expectedUsers, filteredUsers);
    }
}
