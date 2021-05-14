package com.calculator.util;

import com.calculator.internal.AddHelper;

/**
 * Calculator usin using a helper class, AddHelper to do the calculations.
 * 
 * 
 * @author pchauvet
 */
public class Calculator {
	AddHelper helper = new AddHelper();
	
	public int add(int i, int j) {
		return helper.add(i, j);
	}

	public int add(double i, double  j) {
		return helper.add(i, j);
	}

}

