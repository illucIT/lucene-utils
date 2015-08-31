package com.illucit.util;

import org.apache.lucene.analysis.miscellaneous.ASCIIFoldingFilter;

/**
 * Utility class for access to {@link ASCIIFoldingFilter}.
 * 
 * @author Christian Simon
 *
 */
public class ASCIIUtils {

	/**
	 * Maps the chars of the input string to their ascii equivalents.
	 * 
	 * @param inputStr
	 *            the input string
	 * @return the normalized string
	 */
	public static String foldToASCII(String inputStr) {
		char[] input = inputStr.toCharArray();
		int length = input.length;

		// Worst-case length required:
		final int maxSizeNeeded = 4 * length;
		char[] output = new char[maxSizeNeeded];

		int outputPos = ASCIIFoldingFilter.foldToASCII(input, 0, output, 0, length);

		return String.copyValueOf(output, 0, outputPos);
	}

}
