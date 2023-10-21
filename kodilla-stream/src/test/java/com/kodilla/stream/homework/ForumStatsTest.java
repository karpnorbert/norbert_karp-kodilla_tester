package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {

    private List<User> sampleUsers = Arrays.asList(
            new User("Walter White", 50, 7, "Chemists"),
            new User("Young User", 20, 10, "Student"),
            new User("Old User", 60, 5, "Retired"),
            new User("Middle User", 30, 20, "Engineer")
    );

    @Test
    public void testAveragePostsForUsersAbove40() {
        double avg = ForumStats.avgNumberOfPostsForUsersAbove40(sampleUsers);
        assertEquals(6, avg);
    }

    @Test
    public void testAveragePostsForUsersBelow40() {
        double avg = ForumStats.avgNumberOfPostsForUsersBelow40(sampleUsers);
        assertEquals(15, avg);
    }
}
