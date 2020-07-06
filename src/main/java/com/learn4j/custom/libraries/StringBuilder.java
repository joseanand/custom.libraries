/**
 * 
 */
package com.learn4j.custom.libraries;

import java.util.Arrays;

/**
 * @author Jose Anand Antony Raj
 * Custom implementation of StringBuilder
 * Creating a initial char array size of 16
 * by default.
 * Capacity increase as currrentSize + string 
 * length.
 *
 */
public class StringBuilder {
	
	/** The value. */
	char [] value;
	
	/** The count. */
	int count;
	
	/**
	 * Instantiates a new string builder.
	 */
	public StringBuilder() {
		value = new char[16];
	}
	
	/**
	 * Instantiates a new string builder.
	 *
	 * @param capacity the capacity
	 */
	public StringBuilder(int capacity) {
		value = new char[capacity];
	}
	
	/**
	 * Append.
	 *
	 * @param str the str
	 */
	public void append (String str) {
		if (str == null) {
			return;
		}
		int len = str.length();
		capacity (count + len);
		str.getChars(0, len, value, count);
		count += len;
	}

	/**
	 * Capacity.
	 *
	 * @param minimumCapacity the minimum capacity
	 */
	private void capacity(int minimumCapacity) {
		if (minimumCapacity - value.length > 0 ) {
			value = Arrays.copyOf(value, minimumCapacity);
		}
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new String(value, 0, count);
	}
}
