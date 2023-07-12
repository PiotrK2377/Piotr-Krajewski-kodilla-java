package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

private static Logger logger;

@BeforeAll
public static void openLog() {
    logger = Logger.INSTANCE;
    logger.log("loggedIn");
}
    @Test
    void testGetLastLog() {
        //Given
        //when
        String resultLog = logger.getLastLog();
        //Then
        assertEquals("loggedIn", resultLog);
    }
}
