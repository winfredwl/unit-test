package com.winfred.study;

import org.junit.*;

/**
 * @author      Winfred.Wang
 * @since       2017/3/14
 */
public class UtilTest {
    private Util util = new Util();

    @Before
    public void setUp() throws Exception {
        System.out.println("before--------------------------------");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after----------------------------------");
    }

    @Test
    public void testGetHello() throws Exception {
        System.out.println("test----------------------------------");
        Assert.assertEquals("Hello", util.getHello());
    }

    @Test
    public void testGetHello2() throws Exception {
        System.out.println("test2----------------------------------");
        Assert.assertEquals("Hello", util.getHello());
    }
}