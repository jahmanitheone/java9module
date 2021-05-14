package calculator.main;

/**
 * package com.calculator.internal<br/>
 * It has the AddHelper class that does addition calculations. It is a helper
 * class.
 * 
 * Note:
 * We can not access com.calculator.internal package here.
 * 
 * package com.calculator.util<br/>
 * contains the Calculator class. It's the calculator API we expose external. It
 * uses the AddHelper class to the calculations.
 *
 * For now it's not possible to hide the AddHelper and make the
 * com.calculator.internal private to the Calculator class. Unless we make it an
 * inner class arrangement.
 * 
 * Java new modular approach can help instead of inner classes.
 * 
 * @author pchauvet
 */
//import com.calculator.internal.AddHelper;
import com.calculator.util.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = calc.add(12.5, 12.5);

		System.out.println(result);
	}

}
