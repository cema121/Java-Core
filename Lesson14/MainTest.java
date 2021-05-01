package Lesson14;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class MainTest {
    private static Main main;

    @Before
    public void init() {
        main = new Main();
    }

    @Test
    public void test1() {
        Assert.assertTrue(main.second(new int[]{1, 1, 4, 1}));
    }

    @Test
    public void test2() {
        Assert.assertTrue(main.second(new int[]{1, 1, 1, 1}));
    }
    @Test
    public void test3() {
        Assert.assertTrue(main.second(new int[]{4, 4, 4, 4}));
    }

    @Test
    public void test4() {
        Assert.assertTrue(main.second(new int[]{2, 2, 4, 1}));
    }

    @Test
    public void test5() {
        Assert.assertTrue(main.second(new int[]{1, 1, 2, 5}));
    }
}