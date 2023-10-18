package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class ClockTest {

    @Test
    public void shouldReturnDifferentTimesForDifferentBeans() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstClock = context.getBean(Clock.class);
        Thread.sleep(1000);  // czekamy 1 sekundę przed pobraniem kolejnego beana
        Clock secondClock = context.getBean(Clock.class);

        assertNotEquals(firstClock.getTime(), secondClock.getTime());
    }
}
