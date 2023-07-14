package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User steve = new Millenials("Steve Bush");
        User elis = new YGeneration("Elizabeth Taylor");
        User joe = new ZGeneration("Joe Moe");

        //When
        String stevePublic = steve.sharePost();
        System.out.println(steve.name + " publishes on " + stevePublic);
        String elisPublic = elis.sharePost();
        System.out.println(elis.name + " publishes on " + elisPublic);
        String joePublic = joe.sharePost();
        System.out.println(joe.name + " publishes on " + joePublic);

        //Then
        assertEquals("Facebook", elisPublic);
        assertEquals("Twitter", stevePublic);
        assertEquals("Snapchat", joePublic);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John Smith");

        //When
        String johnPublic = john.sharePost();
        System.out.println(john.name + " publishes on " + johnPublic);
        john.setSocialPublisher(new FacebookPublisher());
        johnPublic = john.sharePost();
        System.out.println(john.name + " now publishes on " + johnPublic);

        //Then
        assertEquals("Facebook", johnPublic);
    }
}
