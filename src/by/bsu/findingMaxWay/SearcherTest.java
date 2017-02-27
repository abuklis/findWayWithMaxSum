package by.bsu.findingMaxWay;

import org.junit.Assert;

/**
 * Created by anyab on 27.02.2017.
 */
public class SearcherTest {
    private int[][] values;

    @org.junit.Before
    public void setUp() throws Exception {
        values = new int[][]{
                {7, 0, 0, 0, 0},
                {3, 8, 0, 0, 0},
                {8, 1, 0, 0, 0},
                {2, 7, 7, 4, 0},
                {4, 5, 2, 6, 5}
        };
    }

    @org.junit.Test
    public void testFindWayWithMaxSum() throws Exception {
        int expectedResult = 30;
        int actualResult = Searcher.findWayWithMaxSum(values);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        values = null;
    }
}