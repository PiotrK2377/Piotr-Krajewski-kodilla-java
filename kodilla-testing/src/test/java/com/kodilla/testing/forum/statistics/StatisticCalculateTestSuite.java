package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class StatisticCalculateTestSuite {


    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> resultUserList = new ArrayList<>();
        for (int n = 0; n < usersQuantity; n++) {
            resultUserList.add("SampleUser");
        }
        return resultUserList;
    }
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @Nested
    @DisplayName("Tests with number of posts")
    class TestNumberOfPosts{

        @Test
        void testCalculateAdvStatisticsForPosts0() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            StatisticCalculate statisticCalculate = new StatisticCalculate();
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(3));
            when(statisticsMock.commentsCount()).thenReturn(10);
            //When
            statisticCalculate.calculateAdvStatistics(statisticsMock);
            statisticCalculate.showStatistics(statisticsMock);
            //Then
            Assertions.assertEquals(0, statisticCalculate.getNumberOfPosts());
            Assertions.assertEquals(3, statisticCalculate.getNumberOfUsers());
            Assertions.assertEquals(10, statisticCalculate.getNumbersOfComments());
        }

        @Test
        void testCalculateAdvStatisticsForPosts1000() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            StatisticCalculate statisticCalculate = new StatisticCalculate();
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(125));
            when(statisticsMock.commentsCount()).thenReturn(45);
            //When
            statisticCalculate.calculateAdvStatistics(statisticsMock);
            statisticCalculate.showStatistics(statisticsMock);
            //Then
            Assertions.assertEquals(1000, statisticCalculate.getNumberOfPosts());
            Assertions.assertEquals(125, statisticCalculate.getNumberOfUsers());
            Assertions.assertEquals(45, statisticCalculate.getNumbersOfComments());
        }
    }

    @Nested
    @DisplayName("Tests with number of comments")
    class TestNumberOfComments{

        @Test
        void testCalculateAdvStatisticsForComments0() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            StatisticCalculate statisticCalculate = new StatisticCalculate();
            when(statisticsMock.postsCount()).thenReturn(50);
            when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(14));
            when(statisticsMock.commentsCount()).thenReturn(0);
            //When
            statisticCalculate.calculateAdvStatistics(statisticsMock);
            statisticCalculate.showStatistics(statisticsMock);
            //Then
            Assertions.assertEquals(50, statisticCalculate.getNumberOfPosts());
            Assertions.assertEquals(14, statisticCalculate.getNumberOfUsers());
            Assertions.assertEquals(0, statisticCalculate.getNumbersOfComments());
        }

        @Test
        void testCalculateAdvStatisticsForCommentsLessThanPosts() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            StatisticCalculate statisticCalculate = new StatisticCalculate();
            when(statisticsMock.postsCount()).thenReturn(61);
            when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(23));
            when(statisticsMock.commentsCount()).thenReturn(5);
            //When
            statisticCalculate.calculateAdvStatistics(statisticsMock);
            statisticCalculate.showStatistics(statisticsMock);
            //Then
            Assertions.assertEquals(61, statisticCalculate.getNumberOfPosts());
            Assertions.assertEquals(23, statisticCalculate.getNumberOfUsers());
            Assertions.assertEquals(5, statisticCalculate.getNumbersOfComments());
        }

        @Test
        void testCalculateAdvStatisticsForCommentsMoreThanPosts() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            StatisticCalculate statisticCalculate = new StatisticCalculate();
            when(statisticsMock.postsCount()).thenReturn(33);
            when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(7));
            when(statisticsMock.commentsCount()).thenReturn(251);
            //When
            statisticCalculate.calculateAdvStatistics(statisticsMock);
            statisticCalculate.showStatistics(statisticsMock);
            //Then
            Assertions.assertEquals(33, statisticCalculate.getNumberOfPosts());
            Assertions.assertEquals(7, statisticCalculate.getNumberOfUsers());
            Assertions.assertEquals(251, statisticCalculate.getNumbersOfComments());

        }
    }

    @Nested
    @DisplayName("Tests with number of users")
    class TestNumberOfUsers{

        @Test
        void testCalculateAdvStatisticsForUsers0() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            StatisticCalculate statisticCalculate = new StatisticCalculate();
            when(statisticsMock.postsCount()).thenReturn(24);
            when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(0));
            when(statisticsMock.commentsCount()).thenReturn(7);
            //When
            statisticCalculate.calculateAdvStatistics(statisticsMock);
            statisticCalculate.showStatistics(statisticsMock);
            //Then
            Assertions.assertEquals(24, statisticCalculate.getNumberOfPosts());
            Assertions.assertEquals(0, statisticCalculate.getNumberOfUsers());
            Assertions.assertEquals(7, statisticCalculate.getNumbersOfComments());
        }

        @Test
        void testCalculateAdvStatisticsForUsers1000() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            StatisticCalculate statisticCalculate = new StatisticCalculate();
            when(statisticsMock.postsCount()).thenReturn(345);
            when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(1000));
            when(statisticsMock.commentsCount()).thenReturn(711);
            //When
            statisticCalculate.calculateAdvStatistics(statisticsMock);
            statisticCalculate.showStatistics(statisticsMock);
            //Then
            Assertions.assertEquals(345, statisticCalculate.getNumberOfPosts());
            Assertions.assertEquals(1000, statisticCalculate.getNumberOfUsers());
            Assertions.assertEquals(711, statisticCalculate.getNumbersOfComments());
        }
    }
}
