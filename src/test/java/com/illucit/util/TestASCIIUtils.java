package com.illucit.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Simple Test for ASCII Folding filter.
 * 
 * @author Christian Simon
 *
 */
public class TestASCIIUtils {

	@Test
	public void testASCIIFolding() {

		String source;
		String expected;

		source = "abc ABC xyz XYZ";
		expected = source;
		Assert.assertEquals(expected, ASCIIUtils.foldToASCII(source));

		source = "ein äußerst müßiges Gespräch";
		expected = "ein ausserst mussiges Gesprach";
		Assert.assertEquals(expected, ASCIIUtils.foldToASCII(source));

		source = "áôãeÑü";
		expected = "aoaeNu";
		Assert.assertEquals(expected, ASCIIUtils.foldToASCII(source));
		
	}
}
