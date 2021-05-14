package com.calculator.internal;

/**
 * Helper class for the calculator. Used only by the calculator.
 * 
 * @author pchauvet
 */
public class AddHelper {

	public int add(int i, int j) {
		return i + j;
	}

	public int add(double i, double j) {
		return (int) (i + j);
	}

}
