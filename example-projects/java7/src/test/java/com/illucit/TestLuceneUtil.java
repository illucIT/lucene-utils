package com.illucit;

import org.junit.Test;

import static com.illucit.util.ASCIIUtils.foldToASCII;
import static org.junit.Assert.assertEquals;

public class TestLuceneUtil {

    @Test
    public void testLuceneUtils() {
        assertEquals(foldToASCII("äbc"), "abc");
    }
}
