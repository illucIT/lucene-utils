package com.illucit.util;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Simple Test for ASCII Folding filter.
 *
 * @author Christian Simon
 */
public class TestASCIIUtils {

    @Test
    public void testASCIIFolding() {

        String source;
        String expected;

        source = "abc ABC xyz XYZ";
        expected = source;
        assertEquals(expected, ASCIIUtils.foldToASCII(source));

        source = "ein äußerst müßiges Gespräch";
        expected = "ein ausserst mussiges Gesprach";
        assertEquals(expected, ASCIIUtils.foldToASCII(source));

        source = "áôãeÑü";
        expected = "aoaeNu";
        assertEquals(expected, ASCIIUtils.foldToASCII(source));

    }
}
