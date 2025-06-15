package com.illucit;

import org.junit.jupiter.api.Test;

import static com.illucit.util.ASCIIUtils.foldToASCII;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLuceneUtil {

    @Test
    public void testLuceneUtils() {
        assertEquals("abc", foldToASCII("äbc"));
    }
}
