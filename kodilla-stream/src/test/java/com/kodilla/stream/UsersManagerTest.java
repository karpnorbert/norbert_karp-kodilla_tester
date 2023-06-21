package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersManagerTest {

    @Test
    void testFilterChemistGroupUsernames() {
        // given
        List<String> expectedUsernames = List.of("Walter White", "Gale Boetticher");

        // when
        List<String> chemistUsernames = UsersManager.filterChemistGroupUsernames();

        // then
        assertEquals(expectedUsernames, chemistUsernames);
    }

    @Test
    void testFilterUsersByAge() {
        // given
        List<User> users = UsersRepository.getUsersList();
        int ageThreshold = 40;
        List<User> expectedUsers = List.of(
                new User("Walter White", 50, 7, "Chemists"),
                new User("Gus Firing", 49, 0, "Board"),
                new User("Gale Boetticher", 44, 2, "Chemists"),
                new User("Mike Ehrmantraut", 57, 0, "Security")
        );

        // when
        List<User> filteredUsers = UsersManager.filterUsersByAge(users, ageThreshold);

        // then
        assertEquals(expectedUsers, filteredUsers);
    }

    @Test
    void main() {
    }

    @Test
    void getUserName() {
    }
}
