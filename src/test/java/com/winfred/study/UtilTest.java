package com.winfred.study;

import org.junit.*;

/**
 * @author      Winfred.Wang
 * @since       2017/3/14
 */
public class UtilTest {
    private Util util = new Util();

    @Test
    public void testGetHello() throws Exception {
        System.out.println("test----------------------------------");
        Assert.assertEquals("Hello", util.getHello());
    }
}